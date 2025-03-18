package ru.diasoft.repository;

import ru.diasoft.domain.Faculty;

import java.util.ArrayList;
import java.util.List;

public class FacultyRepository {
    private List<Faculty> faculties;

    public FacultyRepository(){
        this.faculties = new ArrayList<>();
    }

    public void add(Faculty faculty){
        faculties.add(faculty);
    }

    public List<Faculty> findAll(){
        return faculties;
    }

    public Faculty findByName(String name){
        for (Faculty faculty: faculties){
            if (faculty.equals(name)) return faculty;
        }

        return null;
    }
}
