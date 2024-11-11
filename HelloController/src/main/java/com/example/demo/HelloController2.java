package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController2 {
	
	@RequestMapping("/hi")
	
	public String hello()
	{
		return"Hello World";
		
	}

}
