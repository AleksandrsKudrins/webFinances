package ak.webFinances.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ak.webFinances.model.Users;
import ak.webFinances.services.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService userService;
	
	@RequestMapping("/users")
	public List<Users> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public Users getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addTopic(@RequestBody Users user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateTopic(@RequestBody Users user, @PathVariable String id) {
		userService.updateUser(id, user);
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteTopic(@RequestBody Users user, @PathVariable String id) {
		userService.deleteUser(id, user);
	}		
}
