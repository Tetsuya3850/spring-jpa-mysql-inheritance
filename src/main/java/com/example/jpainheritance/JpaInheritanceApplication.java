package com.example.jpainheritance;

import com.example.jpainheritance.models.BankAccount;
import com.example.jpainheritance.models.CreditCard;
import com.example.jpainheritance.repository.BankAccountRepository;
import com.example.jpainheritance.repository.CreditCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaInheritanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaInheritanceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(
			CreditCardRepository creditCardRepository, BankAccountRepository bankAccountRepository
	) {
		return (args) -> {
			creditCardRepository.save(new CreditCard("Jack", "0123456789"));
			bankAccountRepository.save(new BankAccount("John", "987654321"));
		};
	}

}
