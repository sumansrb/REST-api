package com.example.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstPerson() {
		return new PersonV1("Bob Marley");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondPerson() {
		return new PersonV2(new Name(" marry","marlowe"));
		
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonParameter() {
		return new PersonV1("Karlos Druvadi");
	}
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersionOfPersonParameter() {
		return new PersonV2(new Name("Kumuth",  "Talvar"));
	}
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV2 getFirstVersionOfPersonRequestHeader() {
		return new PersonV2(new Name("Tumakura",  "pitrol"));}
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersionOfPersonRequestHeader() {
		return new PersonV2(new Name("Sambit",  "Malik")); }


}
