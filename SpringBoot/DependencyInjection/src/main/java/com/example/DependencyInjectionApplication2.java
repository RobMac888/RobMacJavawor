
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.laptops.Dell;
import com.example.laptops.Apple;
import com.example.interfaces2.Laptop;

@SpringBootApplication
public class DependencyInjectionApplication2 {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		Laptop laptop1=context.getBean("Apple",Laptop.class);
		Laptop laptop2=context.getBean("Dell",Laptop.class);
		
		laptop1.spec();
		laptop2.spec();
	
	}

}


