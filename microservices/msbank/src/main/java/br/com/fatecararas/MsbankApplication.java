package br.com.fatecararas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsbankApplication.class, args);
	}

}

//TODO: Incluir o ms-bank no Service Discovery e no Edge Server
