package ru.diasoft.domain;

import ru.diasoft.Exception.InvalidPhoneNumberException;

public class Person {
    private String firstName;
    private String secondName;
    private short age;
    private String phone;

    boolean checkPhone(String phone){
        return !phone.matches("\\+7\\d{10}") || phone.length() > 12;
    }

    public Person(String firstName, String secondName, short age, String phone) throws InvalidPhoneNumberException {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

        if (checkPhone(phone)) {
            throw new InvalidPhoneNumberException("Неверный формат телефона " + phone);
        } else this.phone = phone;
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

    public void setPhone(String phone) throws InvalidPhoneNumberException {
        if (checkPhone(phone)) {
            throw new InvalidPhoneNumberException("Неверный формат телефона " + phone);
        } else this.phone = phone;
    }
}