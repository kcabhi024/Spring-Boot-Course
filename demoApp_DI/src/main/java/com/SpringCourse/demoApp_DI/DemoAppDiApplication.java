package com.SpringCourse.demoApp_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppDiApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(DemoAppDiApplication.class, args);
		// application context lae beans  lai manually create ra manage garna help garxa.
		// bean is an object that Spring creates and manages inside the container
		Dev obj = context.getBean(Dev.class);
		obj.code();
	}

}
