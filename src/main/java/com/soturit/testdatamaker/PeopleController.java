package com.soturit.testdatamaker;

import java.util.Random;
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
		var allTestData = repository.findAll();
		var rand = new Random();
		var randomFirstName = allTestData.get(rand.nextInt(allTestData.size())).getData();
		return new Person(randomFirstName, "Duck", "don.duck@gmail.com");
	}
}