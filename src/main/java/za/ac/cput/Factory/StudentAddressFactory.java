/**
 * Name: Mandisa Msongelwa
 * Student number: 217149073
 * Group 28
 * Question 2a (Factory Package)
 * StudentAddressFactory.java
 * Date: 10/06/2022
 */

package za.ac.cput.Factory;

import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.StudentAddress;

public class StudentAddressFactory {

    public static StudentAddress buildStudentAddress(String studentId, Address address) {
        return new StudentAddress.Builder()
                .studentId(studentId)
                .address(address)
                .build();
    }
}
