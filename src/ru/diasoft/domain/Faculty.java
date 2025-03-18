package ru.diasoft.domain;

import java.util.ArrayList;
import java.util.List;

public class Faculty{
    private String name;
    private List<Student> listStudents = new ArrayList<>();

    public Faculty(String name){
        this.name = name;
    }

    public void addStudent(Student student) {
        listStudents.add(student);
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public boolean equals(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }
}
