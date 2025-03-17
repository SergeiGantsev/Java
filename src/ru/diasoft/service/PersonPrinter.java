package ru.diasoft.service;
import ru.diasoft.domain.Person;

public class PersonPrinter {
    public static void printFI(Person p){
        System.out.println("printFI: " + "Name " + p.getFirstName() + "; Second name " + p.getSecondName());
    }

    public static void printInfo(Person p){
        System.out.println("printInfo: " + "Name " + p.getFirstName() + "; Second name " + p.getSecondName()
                + "; Age " + p.getAge() + "; Phone " + p.getPhone());
    }
}


// классе PersonPrinter реализовать 2 статических метода: printFI(Person p) - вывод имени и фамилии и printInfo(Person p)
//    - вывод полной информации о человеке.
