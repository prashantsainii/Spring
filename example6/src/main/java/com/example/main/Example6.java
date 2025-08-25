package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);   // name set via PostConstruct annotation is set in this step
//        vehicle.setName("Audiii");  // this step will overwrite the name set
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());    // this will print Audiiii
        vehicle.printHello();
    }
}
