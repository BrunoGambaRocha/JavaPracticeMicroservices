package br.com.brunoti.mentoriamicroservicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MentoriamicroservicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentoriamicroservicosApplication.class, args);

	}

}
