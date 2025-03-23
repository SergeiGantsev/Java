package ru.diasoft.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.diasoft.Exception.InvalidPhoneNumberException;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String phone;

    boolean checkPhone(String phone){
        return !phone.matches("\\+7\\d{10}") || phone.length() > 12;
    }

    public void setPhone(String phone) throws InvalidPhoneNumberException {
        if (checkPhone(phone)) {
            throw new InvalidPhoneNumberException("Неверный формат телефона " + phone);
        } else this.phone = phone;
    }
}