package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/display")
	public String m1(@RequestParam String username,@RequestParam String password,@RequestBody Student s){
	  System.out.println("GET CALL"+username+"-----"+password+"-----"+s.getSname()+"----"+s.getSage());	
		return "get call"+"---"+username+"----"+password+"----"+s.getSname()+"--"+s.getSage();
	}
	
	@PostMapping("/display")
	public String m2(@RequestParam("username")String name,@RequestBody Student s,@RequestParam("password") String password){
	  System.out.println("POST CALL"+name+"-----"+password+"-------"+s);	
	  return "post call"+"---"+name+"----"+password+"----"+s;
	}
}
