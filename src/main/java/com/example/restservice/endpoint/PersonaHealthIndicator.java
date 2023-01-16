package com.example.restservice.endpoint;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import org.springframework.stereotype.Component;

@Component
public class PersonaHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
	  int errorCode =0;
	  if (errorCode != 0) {
	   return Health.down().withDetail("Error Code", errorCode).build();
	  }
	  return Health.up().withDetail("Working", errorCode).build();
		
	 } 

}
