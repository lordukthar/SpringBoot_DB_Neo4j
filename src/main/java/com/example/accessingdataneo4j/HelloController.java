package com.example.accessingdataneo4j;

import com.example.accessingdataneo4j.db.Person;
import com.example.accessingdataneo4j.db.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping("/")
	public String index() {

		return "Greetings from Spring Boot!";
	}


	@GetMapping("/people/{name}")
	public Person index(@PathVariable("name")  String name) {

		return personRepository.findByName(name);
	}

}
