package ak.webFinances.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ak.webFinances.model.Balances;
import ak.webFinances.model.Users;

@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private BalancesRepository balanceRepository;
	
	public List<Users> getAllUsers(){
		List<Users> users = new ArrayList<>();
		
		usersRepository.findAll()
		.forEach(users ::add);
		
		return users;
	}
	
	public void addUser(Users user) {	
		usersRepository.save(user);
		addInitbalance(user.getId());
	}
	
	public Users getUser(String id) {
		return usersRepository.findOne(id);
	}
	
	public void updateUser(String id, Users user) {
		usersRepository.save(user);
	}
	
	public void deleteUser(String id, Users user) {
		usersRepository.delete(user);
	}
	
	public void addInitbalance(String id) {
		Balances balance = new Balances( id, 0, "N", null, "ACTIVE", 0, id);
		balanceRepository.save(balance);
	}
}
