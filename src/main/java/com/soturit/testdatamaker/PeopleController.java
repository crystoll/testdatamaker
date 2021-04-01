package com.soturit.testdatamaker;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

	// @RequestParam(value = "name", defaultValue = "World") String name
	
	@GetMapping("/people")
	public Person greeting() {
		return new Person("Donald","Duck","don.duck@gmail.com");
	}
}