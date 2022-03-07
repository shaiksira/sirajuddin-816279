package com.assignment.emp.empassignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.emp.empassignment.entity.Employee;
import com.assignment.emp.empassignment.repository.EmployeeRepository;


@SpringBootApplication
public class EmpassignmentApplication   implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository  repository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpassignmentApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Employee employee = repository.findById(100L);
		logger.info("employee 100 = {}",employee);
	repository.deleteById(100L);
		repository.save(new Employee("siraj","shaik"));
	}

}
