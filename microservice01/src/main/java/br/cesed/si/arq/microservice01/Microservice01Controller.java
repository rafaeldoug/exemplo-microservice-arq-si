package br.cesed.si.arq.microservice01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice01Controller {

	@GetMapping("/ms01")
	public String test(@RequestHeader("X-ms01-Header") String headerValue) {
		return headerValue;
	}
	
	@GetMapping("/ms01/get")
	public String get() {
		return "GET no endpoint /ms01/get";
	}
}
