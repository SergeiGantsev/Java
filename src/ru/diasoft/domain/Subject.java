package ru.diasoft.domain;

public class Subject implements Comparable<Subject>{
    private String name;
    private int grade;

    public Subject(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
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
