package com.example.obspringEjercicios4_5_6;

import com.example.obspringEjercicios4_5_6.controllers.LaptopController;
import com.example.obspringEjercicios4_5_6.entities.Laptop;
import com.example.obspringEjercicios4_5_6.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ObSpringEjercicios456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringEjercicios456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"Apple","Macbook Air","M1",3.8,8,512,
				13.3,"MacOS Ventura");

		repository.save(laptop1);



	}

}
