package ru.diasoft.service;

import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Student;
import ru.diasoft.repository.FacultyRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface FindAndSort {
    List<Student> FindStudentsByName(Faculty faculty, String name);

    List<Student>  SortStudents(Faculty faculty);

    List<Student>  ExcellentStudents(FacultyRepository facultyRepository);
}
