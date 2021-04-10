package com.soturit.testdatamaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

	private final TestDataRepository repository;

	private Random rand = new Random();

	public PeopleController(TestDataRepository repository) {
		this.repository = repository;
	}

	private String getRandomDataValue(List<TestData> data) {
		return data.get(rand.nextInt(data.size())).getData();
	}

	@GetMapping("/people")
	public List<Person> greeting() {
		var allFirstNames = repository.findAllByDataType(DataType.FIRST_NAME);
		var allLastNames = repository.findAllByDataType(DataType.LAST_NAME);
		var people = new ArrayList<Person>();
		for (int i=0;i<10;i++) {
			var randomFirstName = getRandomDataValue(allFirstNames);
			var randomLastName = getRandomDataValue(allLastNames);
			var randomEmail = randomFirstName + "." + randomLastName + "@gmail.com";
			var person = new Person(randomFirstName, randomLastName, randomEmail);	
			people.add(person);				
		}
		return people;
	}
}