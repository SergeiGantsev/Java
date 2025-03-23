package ru.diasoft.domain;

import lombok.Getter;

public class Subject implements Comparable<Subject>{
    @Getter
    private String name;
    private int grade;

    public Subject(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Subject o) {
        return o.getName().compareTo(this.name);
    }

    @Override
    public String toString() {
        return "         Subject: " + name + ", grade: " + grade;
    }

    public int getGrade() {
        return grade;
    }
}
