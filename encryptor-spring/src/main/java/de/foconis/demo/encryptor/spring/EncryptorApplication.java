package de.foconis.demo.encryptor.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "de.foconis.demo.encryptor")
public class EncryptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncryptorApplication.class, args);
	}

}
