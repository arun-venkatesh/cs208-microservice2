package com.cs208.microservice2;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Handler.class)
public class CS208Microservice2 {
	
	@Value("${PORT:8082}")
	String port;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CS208Microservice2.class);
		CS208Microservice2 cs208Microservice2 = new CS208Microservice2();
		cs208Microservice2.init(app, args);
	}
	
	private void init(SpringApplication app, String[] args) {
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", port));
		app.run(args);
	}

}
