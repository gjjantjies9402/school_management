package za.ac.cput.Services.impl;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Repository.Interfaces.IEmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeService implements IEmployeeRepository {
    @Override
    public List<Employee> findByEmployeeStaffId(String staffId) {
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> read(Employee.EmployeeId employeeId) {
        return Optional.empty();
    }

    @Override
    public void delete(Employee employee) {

    }
}
