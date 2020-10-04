package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.service.FirebaseService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@RestController
public class UserController {
	
	@Autowired
	FirebaseService firebaseService;
	
	
	@GetMapping("/getMessage")
	public Message getSuccess() {
		return new Message("this is large message to passed");
	}
	
	@GetMapping("/getId")
	public String getId(@RequestParam ("id") int id) {
		return Integer.toString(id);
	}
	
	
	
	
	

}
