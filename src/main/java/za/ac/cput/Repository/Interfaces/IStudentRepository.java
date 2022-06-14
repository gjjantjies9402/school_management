package za.ac.cput.Repository.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {
}


