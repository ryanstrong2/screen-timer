package org.ryanstrong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //adds @Configuration & @EnableAutoConfiguration
public class ScreenTimerApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(ScreenTimerApplication.class, args);
	}
}
