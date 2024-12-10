package com.xworkz.runner;

import com.xworkz.service.PersonService;
import com.xworkz.service.PersonServiceImpl;
import com.xworkz.entity.PersonEntity;

public class Runner {

    public static void main(String[] args) {

        PersonService personService = new PersonServiceImpl();

        PersonEntity person1 = new PersonEntity("Shamanth", "9449706524", "Male");
        PersonEntity person2 = new PersonEntity("Sharath", "9889987654", "Male");
        PersonEntity person3 = new PersonEntity("Vinay", "9345678901", "Male");
        PersonEntity person4 = new PersonEntity("Nagaraj", "9321289231", "Male");

        System.out.println("Saving Shamanth: " + personService.save(person1));
        System.out.println("Saving Sharath: " + personService.save(person2));
        System.out.println("Saving Vinay: " + personService.save(person3));
        System.out.println("Saving Nagaraj: " + personService.save(person4));

        System.out.println("Phone by ID  " + personService.getPhById(4));
        System.out.println("Name by ID =1: " + personService.getNameById(1));
        System.out.println("Created At by Phone 9321289231: " + personService.getDateAndTimeByPhno("9321289231"));
        System.out.println("Gender by Name = Nagaraj: " + personService.getGenderByName("Nagaraj"));
    }
}
