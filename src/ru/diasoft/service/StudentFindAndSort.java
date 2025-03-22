package ru.diasoft.service;

import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Student;
import ru.diasoft.repository.FacultyRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentFindAndSort implements FindAndSort{

    @Override
    public List<Student> FindStudentsByName(Faculty faculty, String name) {
        return faculty.getListStudents().stream().filter(student -> student.getFirstName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<Student>  SortStudents(Faculty faculty) {
        return faculty.getListStudents().stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSecondName().compareTo(o2.getSecondName());
            }
        }).collect(Collectors.toList());
    }

    @Override
    public List<Student> ExcellentStudents(FacultyRepository facultyRepository) {
        //Все студенты
        List<Student> listStudents = facultyRepository.findAll().stream().flatMap(faculty -> faculty.getListStudents().stream()).collect(Collectors.toList());

        //Только отличники
        return listStudents.stream()
                .filter(student -> !student.getSubjects().isEmpty())
                .filter(student -> student.getSubjects().stream()
                        .allMatch(subject -> subject.getGrade() == 5))
                .collect(Collectors.toList());
    }
}
