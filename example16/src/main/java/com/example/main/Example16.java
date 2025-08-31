package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.services.VehicleService;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Example16 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vh1 = context.getBean(VehicleService.class);
        VehicleService vh2 = context.getBean(VehicleService.class);

        System.out.println("Hashcode of object vehicleService1 : " + vh1.hashCode());
        System.out.println("Hashcode of object vehicleService2 : " + vh2.hashCode());

        if(vh1 == vh2) {
            System.out.println("VehicleService bean is singleton scoped bean");
        } else {
            System.out.println("VehicleService bean is prototype scoped bean");
        }

        // Output

//        VehicleService object is created
//        Vehicle Bean is created
//        Person bean instantiated
//        VehicleService object is created
//        VehicleService object is created
//        Hashcode of object vehicleService1 : 1248234350
//        Hashcode of object vehicleService2 : 1600667055
//        VehicleService bean is prototype scoped bean

//        VehicleService object is created -> is appearing 3 times because one bean will be
//        created for dependency injection. And that bean will be of type Singleton or
//        prototype depending on Parent Bean type.
//        rest 2 times it is coming because we are instantiating Prototype bean in main


    }
}
