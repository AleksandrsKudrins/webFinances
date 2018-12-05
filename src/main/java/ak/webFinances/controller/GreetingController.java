package ak.webFinances.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
