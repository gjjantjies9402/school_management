package za.ac.cput.Repository.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.StudentAddress;
import za.ac.cput.Repository.Interfaces.IStudentAddressRepository;

import java.util.List;

@Repository
public  abstract class StudentAddressRepository implements IStudentAddressRepository {

    public StudentAddress readStudentId(Address address) {
        List<StudentAddress> studentAddresses = findAll();
        return studentAddresses.stream().filter(studentAddress -> studentAddress.getAddress().equals(String.valueOf(address))).findAny().orElse(null);
    }
}
