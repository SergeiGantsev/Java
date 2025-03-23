package ru.diasoft.domain;

import lombok.*;
import ru.diasoft.Exception.InvalidPhoneNumberException;

import java.util.Set;
import java.util.TreeSet;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class Student extends Person{
    private String group;
    private int course;
    public Set<Subject> subjects= new TreeSet<>();

    public Student(String firstName, String secondName, int age, String phone, String group, int course) throws InvalidPhoneNumberException {
        super(firstName, secondName, age, phone);

        this.group = group;
        this.course = course;
    }
}
