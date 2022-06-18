package za.ac.cput.Repository.impl;


import za.ac.cput.Domain.Employee;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Repository.Interfaces.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeRepository implements IEmployeeRepository{
    //Singleton implementation
    private List<Employee> employeeList;
    private static EmployeeRepository EMPLOYEE_REPOSITORY;
    private EmployeeRepository(){
        this.employeeList = new ArrayList<>();
    }
    public static EmployeeRepository employeeRepository(){
        if(EMPLOYEE_REPOSITORY == null)
            EMPLOYEE_REPOSITORY = new EmployeeRepository();
        return EMPLOYEE_REPOSITORY;
    }
    //CRUD operation
    //save employee into data store, check if employee exists and return if exists and update
    public Employee save (Employee employee){
        Employee.EmployeeId employeeId = EmployeeFactory.buildId(employee);
        Optional<Employee> read = read(employeeId);
        if(read.isPresent()){
            delete(read.get());
        }
        this.employeeList.add(employee);
        return employee;

    }
    @Override
    //find the employee that matches with the id and return
    public Optional<Employee> read(Employee.EmployeeId employeeId) {
        return this.employeeList.stream()
                .filter(employee -> employee.getStaffId().equalsIgnoreCase(employeeId.getStaffId()))
                .filter(employee -> employee.getEmail().equalsIgnoreCase(employeeId.getEmail()))
                .findFirst();
    }
    //find the employee needed and delete
    public void delete(Employee employee){
        this.employeeList.remove(employee);
    }

    public List<Employee> findByEmployeeStaffId(String staffId){
        return this.employeeList.stream()
                .filter(employee -> employee.getStaffId().equalsIgnoreCase(staffId))
                .collect(Collectors.toList());
    }
}
