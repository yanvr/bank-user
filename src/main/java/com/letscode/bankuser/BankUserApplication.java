package com.letscode.bankuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BankUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankUserApplication.class, args);
	}

}
