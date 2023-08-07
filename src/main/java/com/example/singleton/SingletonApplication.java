package com.example.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
	
		// Get the instance of the SingletonClass
        SingletonClass singletonInstance = SingletonClass.getInstance();

        // Now you can use the SingletonClass instance to perform actions
        // For example, you can call a method on the SingletonClass
        singletonInstance.someMethod();
	}

}

