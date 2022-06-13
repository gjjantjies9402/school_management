package za.ac.cput.Factory;

import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.EmployeeAddress;

public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(String staffId, Address address){

        EmployeeAddress emploAddress = new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();

        return emploAddress;
    }
}
