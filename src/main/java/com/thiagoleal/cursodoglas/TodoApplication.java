package com.thiagoleal.cursodoglas;

import com.thiagoleal.cursodoglas.Controller.TodoController;
import com.thiagoleal.cursodoglas.model.Todo;
import com.thiagoleal.cursodoglas.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication {

	@Autowired
	private TodoRepository todoRepository;



	public static void main(String[] args) {

		SpringApplication.run(TodoApplication.class, args);

	}

}
