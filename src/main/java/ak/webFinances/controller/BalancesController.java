package ak.webFinances.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ak.webFinances.model.Balances;
import ak.webFinances.services.BalancesService;

@RestController
public class BalancesController {
	@Autowired
	private BalancesService balancesService;
	
	@RequestMapping("/users/{id}/balances")
	public Balances getBalance(@PathVariable String id) {
		return balancesService.getBalance(id);
	}
}
