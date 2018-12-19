package ak.webFinances.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ak.webFinances.model.Orders;

@Service
public class OrdersService {
	@Autowired
	private OrdersRepository ordersRepository;
	
	public List<Orders> getAllOrders(String userId){
		List<Orders> orders = new ArrayList<>();
		
		ordersRepository.findByUserId(userId)
		.forEach(orders ::add);
		
		return orders;
	}
	
	public void addOrder(Orders order) {
		ordersRepository.save(order);
	}
	
	public Orders getOrder(String id) {
		return ordersRepository.findOne(id);
	}
	
	public void updateOrder(Orders order) {
		ordersRepository.save(order);
	}
	
	public void deleteOrder(String id, Orders order) {
		ordersRepository.delete(order);
	}
}