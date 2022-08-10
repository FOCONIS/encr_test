package de.foconis.demo.encryptor.spring;

import de.foconis.demo.encryptor.api.Encryptor;
import de.foconis.demo.encryptor.impl.DummyEncryptor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roland Praml, FOCONIS AG
 */
@RestController
@Component
public class EncryptionController {

	public EncryptionController() {
		System.out.println("DO");
	}
	Encryptor encryptor = new DummyEncryptor();

	@GetMapping("/encrypt/{value}")
	public int encrypt(@PathVariable("value") int value) {
		return encryptor.encrypt(value);
	}
}
