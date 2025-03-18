package ru.diasoft.service;

import ru.diasoft.Exception.InvalidPhoneNumberException;
import ru.diasoft.domain.Person;

public class PersonDemo {
    public static void demo(){
        Person person = null;

        try {
            person = new Person("Ivan", "Ivanov", (short) 23, "+78932312231");

            PersonPrinter.printInfo(person);
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            person = new Person("Ivan", "Ivanov", (short) 23, "+7893231223A");

            PersonPrinter.printInfo(person);
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            person = new Person("Ivan", "Ivanov", (short) 23, "+78932312231");

            person.setPhone("+712312");

            PersonPrinter.printInfo(person);
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
