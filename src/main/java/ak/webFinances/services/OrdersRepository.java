package ak.webFinances.services;

import org.springframework.data.repository.CrudRepository;

import ak.webFinances.dto.Orders;

public interface OrdersRepository extends CrudRepository<Orders, String>{


}
