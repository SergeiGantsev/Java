package ru.diasoft.domain;

import ru.diasoft.Exception.InvalidPhoneNumberException;

import java.util.*;

public class Student extends Person{
    private String group;
    private int course;
    public Set<Subject> subjects= new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

    public Student(String firstName, String secondName, int age, String phone, String group, int course) throws InvalidPhoneNumberException {
        super(firstName, secondName, age, phone);

        this.group = group;
        this.course = course;
    }
}
