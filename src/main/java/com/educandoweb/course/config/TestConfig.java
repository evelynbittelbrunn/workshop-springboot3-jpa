package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
// 	A anotação @Autowired indica ao Spring que ele deve injetar automaticamente
// 	uma instância de UserRepository nesta variável. O Spring cria e gerencia
// 	a implementação do UserRepository, facilitando o gerenciamento de dependências
// 	e permitindo que o código se concentre na lógica de negócios, em vez de 
// 	na criação e gerenciamento de objetos.
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
