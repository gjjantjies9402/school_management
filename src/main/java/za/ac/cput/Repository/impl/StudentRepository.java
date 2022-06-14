package za.ac.cput.Repository.impl;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Student;
import za.ac.cput.Repository.Interfaces.IStudentRepository;
import java.util.*;

@Repository
public abstract class StudentRepository implements IStudentRepository {

    public static StudentRepository readStudentId() {
        return readStudentId();
    }

    public Student readStudentId(String studentId) {
        List<Student> students = findAll();
        return students.stream().filter(student -> student.getStudentId().equalsIgnoreCase(studentId)).findAny().orElse(null);
    }
}
