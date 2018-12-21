package ak.webFinances.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ak.webFinances.model.Balances;

@Service
public class BalancesService {
	@Autowired
	private BalancesRepository balancesRepository;
		
	public Balances getBalance(String id) {
		return balancesRepository.findOne(id);
	}

	public void addBalance(Balances balance) {
		balancesRepository.save(balance);
	}	
	
}
