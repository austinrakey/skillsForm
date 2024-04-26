package org.launchcode.skillstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.launchcode.skillstracker.controllers"})
public class SkillsTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsTrackerApplication.class, args);
	}

}
