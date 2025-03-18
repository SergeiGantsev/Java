package ru.diasoft.service;

import ru.diasoft.domain.Person;

public class PersonDemo {
    private static Person person = new Person("Ivan", "Ivanov", (short) 23, "+78932312");

    public static void demo(){
        PersonPrinter.printFI(person);
        PersonPrinter.printInfo(person);
    }
}
