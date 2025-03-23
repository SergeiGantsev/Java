package ru.diasoft.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Data
@AllArgsConstructor
public class Faculty{
    private String name;
    private List<Student> listStudents = new ArrayList<>();

    public Faculty(String name){
        this.name = name;
    }

    public void addStudent(Student student) {
        listStudents.add(student);
    }
}
