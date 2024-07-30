package com.cursojava.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// estas anoccioncon @ al incicio , indican una funcuionalidad a lo que viene como clases o funcinoes
// osea que la calse pincipal usara spring
@SpringBootApplication
public class CursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
