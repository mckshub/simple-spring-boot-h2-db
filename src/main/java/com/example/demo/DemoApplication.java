package com.example.demo;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private RoleRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Adding preloaded data set to H2 database");
		repository.save(new Role(1, "ADMIN", "Administrator"));
		repository.save(new Role(2, "VENDOR", "Vendor"));
		repository.save(new Role(3, "CUST", "Customer"));
	}

}
