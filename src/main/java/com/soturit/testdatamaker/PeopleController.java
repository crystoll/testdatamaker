package com.soturit.testdatamaker;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

	private final TestDataRepository repository;


	public PeopleController(TestDataRepository repository) {
		this.repository = repository;
	}
	

	@GetMapping("/people")
	public Person greeting() {
		System.out.println(repository.findAll());
		return new Person("Donald","Duck","don.duck@gmail.com");
	}
}