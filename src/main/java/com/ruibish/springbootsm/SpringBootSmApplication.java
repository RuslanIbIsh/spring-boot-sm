package com.ruibish.springbootsm;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class SpringBootSmApplication {


	@RequestMapping("/")
	String home() {
		return "Spring Boot simple result";
	}
@RequestMapping("/new")
	String newForm() {
return "this is new folder";
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringBootSmApplication.class, args);

		/*
		* if you want to run localy the project
		* from mvn
		* just write in folder of project
		*
		* mvn spring-boot:run
		*
		* if you want to stop the proces
		* just ctrl+c  Y
		*
		* additionally Second way to run springBoot project
		* write in folder of project
		* mvn package
		* => builded jar in target folder
		*
		* if you have problem just commit the default test method
		*
		* in project forlde write
		*
		* java -jar target\ourjarfile
		*
		*
		*
		* */
	}

}
