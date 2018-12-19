package ak.webFinances.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ak.webFinances.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, String>{
	public List<Orders> findByUserId(String userId);
}