package ru.diasoft.domain;

import ru.diasoft.Exception.InvalidPhoneNumberException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Student extends Person{
    private String group;
    private int course;
    public Set<Subject> subjects= new TreeSet<>();

    public Student(String firstName, String secondName, int age, String phone, String group, int course) throws InvalidPhoneNumberException {
        super(firstName, secondName, age, phone);

        this.group = group;
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(short course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }
}
