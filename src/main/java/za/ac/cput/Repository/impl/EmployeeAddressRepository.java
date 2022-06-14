package za.ac.cput.Repository.impl;
/**
 * Author: Mziyanda Mwanda 215133765
 * POJO EmployeeAddressRepository.java
 *  EmployeeAddress Repository file to be implemented
 * Created: 12/6/2022
 * */
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.EmployeeAddress;
import za.ac.cput.Repository.Interfaces.IEmployeeAddressRepository;

import java.util.List;

@Repository
public abstract class EmployeeAddressRepository implements IEmployeeAddressRepository {

    public EmployeeAddress retrieve (String staffId){

        List<EmployeeAddress> employeeAddresses = findAll();

        return employeeAddresses.stream().filter(employeeAddress1 -> employeeAddress1.getStaffId().equalsIgnoreCase(staffId)).findAny().orElse(null);
    }
}
