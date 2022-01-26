package com.thiagoleal.cursodoglas;

import com.thiagoleal.cursodoglas.model.LivrariaEntity;
import com.thiagoleal.cursodoglas.repository.LivrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication {

	@Autowired
	private LivrariaRepository livrariaRepository;

	@Bean
	public  CommandLineRunner init (){
		return new CommandLineRunner(){
			@Override
			public void run(String...args)throws Exception{
				LivrariaEntity livrariaEntity = new LivrariaEntity();
				livrariaEntity.setNome("Spring");
				livrariaEntity.setEditora("Thiago");
				livrariaEntity.setCreateDate(LocalDateTime.now());
				livrariaRepository.save(livrariaEntity);

			}
		};
	}

	public static void main(String[] args) {

		SpringApplication.run(TodoApplication.class, args);

	}

}
