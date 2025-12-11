package se.chasacademy.databaser.jpastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JPAStartApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(JPAStartApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}
}
