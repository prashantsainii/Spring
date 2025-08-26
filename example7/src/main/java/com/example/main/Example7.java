package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Example7 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");

        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        int num = 3;

        if(num % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        }
        else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while catching volkswagen vehicle");
        }
        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while catching audi vehicle");
        }

        if(null != volksVehicle) {
            System.out.println("Programming vehicle name from Spring Context is: "+ volksVehicle.getName());
        }
        else {
            System.out.println("Programming vehicle name from Spring Context is: "+ audiVehicle.getName());
        }
    }
}
