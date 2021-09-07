package br.cesed.si.arq.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class CircuitBreakerController {
	
	@GetMapping("/microservice01")
	public String ms01ServiceFallback() {
		return "Fallback do Microservice 01";
	}

}
