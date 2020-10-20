package org.example;

import org.example.model.Address;
import org.example.model.Person;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Address address = context.getBean("address", Address.class);

        //récuperation du bean avec constructeur initialisé dans le xml
        Person pe = context.getBean("person", Person.class);
       // pe.setAddress(address);

        System.out.println(pe);




    }
}
