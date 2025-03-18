package ru.diasoft.service;

import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;

public class PersonDemo {
    private static Person person = new Person("Ivan", "Ivanov", (short) 23, "+78932312");

    private static Student student = new Student("Petr", "Petrov", (short) 19, "+7111111", "1.1", (short) 1);

    public static void demo(){
        //PersonPrinter.printFI(person);
        //PersonPrinter.printInfo(person);

        StudentPrinter sp = new StudentPrinter();
        sp.printInfo(student);
    }
}
