package com.carshoprepair.carshop;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.service.PersonService;
import com.carshoprepair.carshop.service.RepairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CarshopApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonService personService;

	@Autowired
	private RepairService repairService;


	public static void main(String[] args) {
		SpringApplication.run(CarshopApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {

		logger.info("-------------------------");
		logger.info("Retireve all Persons from db");
		personService.getAllPersons().forEach(person -> logger.info(person.toString()));

		logger.info("--------------------------");
		logger.info("Only one Customer here");
		Optional<Person> foundPerson = personService.findPerson(1L);
		foundPerson.ifPresent(person -> logger.info(person.toString()));
		foundPerson.ifPresent(person -> logger.info(person.getType().getType()));



		logger.info("--------------------------");
		logger.info("Now Repairs");
		repairService.findAll().forEach(repair -> logger.info(repair.toString()));


		logger.info("-----------------------------");
		logger.info("Find Repairs by Person");
		Optional<Person> foundPerson1 = personService.findPerson(1L);
		foundPerson1.ifPresent(person -> repairService.findByPerson(person).forEach(repair -> logger.info(repair.toString())));








		logger.info("One Repair");


	}



}
