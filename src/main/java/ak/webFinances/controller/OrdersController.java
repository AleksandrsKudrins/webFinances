package ak.webFinances.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ak.webFinances.dto.Orders;
import ak.webFinances.services.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService orderService;
	
	@RequestMapping("/orders")
	public List<Orders> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@RequestMapping("/orders/{id}")
	public Orders getOrder(@PathVariable String id) {
		return orderService.getOrder(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/orders")
	public void addTopic(@RequestBody Orders order) {
		orderService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/orders/{id}")
	public void updateTopic(@RequestBody Orders order, @PathVariable String id) {
		orderService.updateOrder(id, order);
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/orders/{id}")
	public void deleteTopic(@RequestBody Orders order, @PathVariable String id) {
		orderService.deleteOrder(id, order);
	}		
}
