package com.sarat.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarat.microservices.limitsservices.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
		
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(), 
				configuration.getMinimum());
		return limitConfiguration;
//		return new LimitConfiguration(1000,100);
	}	

}
