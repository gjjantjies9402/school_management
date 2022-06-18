package za.ac.cput.Services.Interfaces;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Domain.Name;

import java.util.List;

public interface IEmployeeServices extends IService<Employee, String>{
    public List<Employee> findAll();
    public List<Employee> getEmployeeName(String email);
}
