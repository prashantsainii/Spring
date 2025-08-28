package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.services.VehicleService;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String[] persons = context.getBeanNamesForType(Person.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        // Approach 1
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();

        // Approach 2
//        vehicle.getVehicleService().playMusic();
//        vehicle.getVehicleService().moveVehicle();

        System.out.println(vehicle.getVehicleService().getSpeakers());
        System.out.println(vehicle.getVehicleService().getTyres());
    }
}
