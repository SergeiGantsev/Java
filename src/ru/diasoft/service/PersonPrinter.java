package ru.diasoft.service;
import ru.diasoft.domain.Person;

public class PersonPrinter {
    public static void printFI(Person p){
        System.out.print("Person - " + "Name: " + p.getFirstName() + "; Second name: " + p.getSecondName());
    }

    public static void printInfo(Person p){
        System.out.print("   Person - " + "Name: " + p.getFirstName() + "; Second name: " + p.getSecondName()
                + "; Age: " + p.getAge() + "; Phone: " + p.getPhone());
    }
}