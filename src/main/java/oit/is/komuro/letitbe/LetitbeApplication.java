package oit.is.komuro.letitbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class LetitbeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetitbeApplication.class, args);
	}

}
