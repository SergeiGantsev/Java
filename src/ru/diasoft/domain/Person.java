package ru.diasoft.domain;

public class Person {
    private String firstName;
    private String secondName;
    private short age;
    private String phone;

    public Person(String firstName, String secondName, short age, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public short getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}