package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Persona;

//import com.example.restservice.model.Greeting;
@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	/*private Persona persona = new Persona(); 
	@GetMapping("/grettingObject")
	public Object grettingObject() {
		persona.setNombre("Carlos");
		persona.setApellidos("Flores");
		persona.setEdad(22);
		persona.setCorreo("carlos@email.com");
		
		return persona;
	}*/
}