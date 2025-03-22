package ru.diasoft.service;

import ru.diasoft.Exception.InvalidPhoneNumberException;
import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;
import ru.diasoft.domain.Subject;
import ru.diasoft.repository.FacultyRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDemo {
    public static void demo() {
        Student student1 = null;
        try {
            //System.out.println("===============Блок предметы===================");
            student1 = new Student("Ivan", "Ivanov", 23, "+78932312231", "1.3", 1);

            student1.subjects.add(new Subject("Математика", 5));
            student1.subjects.add(new Subject("Русский", 4));
            student1.subjects.add(new Subject("География", 2));

          StudentPrinter sp = new StudentPrinter();
/*              sp.printInfo(student1);

            System.out.println();

            System.out.println("===============Блок факультеты===================");*/

            Student student2 = new Student("Ivan1", "Ivanov1", 23, "+78932312232", "2.3", 2);
            student2.subjects.add(new Subject("Математика", 5));
            student2.subjects.add(new Subject("Русский", 5));

            Student student3 = new Student("Ivan2", "Ivanov2", 21, "+78932312233", "2.4", 2);
            Student student4 = new Student("Ivan1", "Ivanov3", 21, "+78932312234", "3.3", 3);
            Student student5 = new Student("Ivan4", "Ivanov4", 26, "+78932312235", "4.3", 4);
            Student student6 = new Student("Ivan5", "Ivanov5", 27, "+78932312236", "5.3", 5);

            FacultyRepository facultyRepository = new FacultyRepository();

            Faculty faculty1 = new Faculty("Математический ф-т");

            faculty1.addStudent(student1);
            faculty1.addStudent(student2);
            faculty1.addStudent(student3);
            faculty1.addStudent(student4);

            facultyRepository.add(faculty1);

            Faculty faculty2 = new Faculty("Экономический ф-т");
            faculty2.addStudent(student5);
            faculty2.addStudent(student6);
            facultyRepository.add(faculty2);

            StudentFindAndSort studentFindAndSort = new StudentFindAndSort();

            System.out.println("===============Фильтр по имени Ivan1===================");
            studentFindAndSort.FindStudentsByName(faculty1,"Ivan1").forEach(sp::printInfo);

            System.out.println("===============Сортировка по фамилии===================");
            studentFindAndSort.SortStudents(faculty1).forEach(sp::printInfo);

            System.out.println("===============Вывод отличников===================");
            studentFindAndSort.ExcellentStudents(facultyRepository).forEach(sp::printInfo);

        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
