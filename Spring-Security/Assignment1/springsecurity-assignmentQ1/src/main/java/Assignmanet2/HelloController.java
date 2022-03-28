package Assignmanet2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "<h1>Hello World</h1>";
	}
	

	@RequestMapping("/Welcome")
	public String welcome()
	{
		return "<h1>Welcome poo</h1>";
	}

}
