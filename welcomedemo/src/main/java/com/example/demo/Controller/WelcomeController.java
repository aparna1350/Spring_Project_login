package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/login/{username}")
public String login(@PathVariable("username") String username)
{
	return "Login is successfull for "+username;
}
}
