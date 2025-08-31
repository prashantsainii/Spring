package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.services.VehicleService;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Example15 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // By default, Beans are instantiated eagerly
        // Use @Lazy over the @Bean or @Component for lazy instantiation

        System.out.println("Before retrieving person bean from Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving person bean from Spring Context");

    }
}
