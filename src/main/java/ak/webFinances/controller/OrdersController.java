package ak.webFinances.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ak.webFinances.model.Orders;
import ak.webFinances.model.Users;
import ak.webFinances.services.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService orderService;
	
	@RequestMapping("/users/{id}/orders")
	public List<Orders> getAllOrders(@PathVariable String id) {
		return orderService.getAllOrders(id);
	}
	
	@RequestMapping("/users/{userId}/orders/{id}")
	public Orders getOrder(@PathVariable String id) {
		return orderService.getOrder(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/orders")
	public void addTopic(@RequestBody Orders order, @PathVariable String userId) {
		order.setUser(new Users(userId, "", "", "", ""));
		orderService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{userId}/orders/{id}")
	public void updateTopic(@RequestBody Orders order,@PathVariable String userId, @PathVariable String id) {
		order.setUser(new Users(userId, "", "", "", ""));
		orderService.updateOrder(order);
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{userId}/orders/{id}")
	public void deleteTopic(@RequestBody Orders order, @PathVariable String id) {
		orderService.deleteOrder(id, order);
	}		
}