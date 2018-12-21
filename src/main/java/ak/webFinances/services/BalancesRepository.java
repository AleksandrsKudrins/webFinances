package ak.webFinances.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ak.webFinances.model.Balances;
	
public interface BalancesRepository extends CrudRepository<Balances, String>{
		public List<Balances> findByUserId(String userId);
}
