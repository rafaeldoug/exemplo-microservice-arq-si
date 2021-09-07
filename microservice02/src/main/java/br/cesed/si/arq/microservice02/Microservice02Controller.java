package br.cesed.si.arq.microservice02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice02Controller {

	@GetMapping("/ms02")
	public String test() {
		return "Acesso ao Microservice 02";
	}
	
	@GetMapping("/ms02/get")
	public String get() {
		return "GET no endpoint /ms02/get";
	}
}
