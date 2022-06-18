package za.ac.cput.Repository.Interfaces;

import za.ac.cput.Domain.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository extends IRepo<Employee, Employee.EmployeeId>{
    List<Employee> findByEmployeeStaffId(String staffId);
}
