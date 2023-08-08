# GoF_SpringBoot_1.Singleton

In this application we crate two classes, one for the main application execution and the other class for defining a singleton class.

## SingletonApplication
```java
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
```

## SingletonClass
```java
package com.example.singleton;

public class SingletonClass {

    // The single instance of the SingletonClass
    private static SingletonClass instance;

    // Private constructor to prevent instantiation from other classes
    private SingletonClass() {
        // Initialization code, if any
    }

    // Public static method to get the instance of the SingletonClass
    public static SingletonClass getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // Example method to demonstrate usage
    public void someMethod() {
        System.out.println("Hello from SingletonClass!");
    }

    // Other methods and properties of the SingletonClass can be added here
}
```





