package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.

To tell Spring it needs to search for classes annotated
with stereotype annotations, we use the @ComponentScan annotation over the configuration
class.
* */
@Configuration
@ComponentScan(basePackages = {"com.example.implementation", "com.example.services"})  // @Component is missing so even on scanning beans will not be registered in Spring context
@ComponentScan(basePackageClasses = {com.example.beans.Person.class, com.example.beans.Vehicle.class})
public class ProjectConfig {


}
