package ru.diasoft.service;

import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;

public class StudentPrinter implements Printer{

    @Override
    public void printInfo(Person p){
        PersonPrinter.printInfo(p);

        Student s = (Student)p;

        System.out.println("group: " + s.getGroup() + ", Course: " + s.getCourse());
    }
}
