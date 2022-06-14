package za.ac.cput.Services.Interfaces;

import za.ac.cput.Domain.EmployeeAddress;

import java.util.List;

public interface IEmployeeAddressService extends IService<EmployeeAddress, String> {
    List <EmployeeAddress> getAll();
}
