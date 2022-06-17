package za.ac.cput.Repository.Interfaces;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Student;

@Repository
public interface IStudentRepository extends IRepository<Student, String> {
}


