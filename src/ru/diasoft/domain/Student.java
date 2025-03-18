package ru.diasoft.domain;

public class Student extends Person{
    private String group;
    private short course;

    public Student(String firstName, String secondName, short age, String phone, String group, short course) {
        super(firstName, secondName, age, group);

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

    public short getCourse() {
        return course;
    }
}
