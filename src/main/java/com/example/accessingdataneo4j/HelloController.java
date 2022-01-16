package com.example.accessingdataneo4j;

import com.example.accessingdataneo4j.db.Person;
import com.example.accessingdataneo4j.db.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/peoples")
public class HelloController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping("/")
	public String index() {

		return "Greetings from Spring Boot!";
	}


	@GetMapping("/{name}")
	public Person get(@PathVariable("name")  String name) {

		return personRepository.findByName(name);
	}

	@PostMapping("/")
	public Person add(@RequestBody  Person p) {
		System.out.println("AA" + p.getName() + p.toString());
		return personRepository.save(p);
	}

}
