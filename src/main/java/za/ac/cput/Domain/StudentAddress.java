/**
 * Name: Mandisa Msongelwa
 * Student number: 217149073
 * Group 28
 * Question 1 (Domain Package)
 * StudentAddress.java
 * Date: 10/06/2022
 */

package za.ac.cput.Domain;


import za.ac.cput.Repository.impl.StudentAddressRepository;

public class StudentAddress {

    private String studentId;
    private Address address;

    public StudentAddress(){}

    public StudentAddress(Builder builder) {
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId() {return studentId;}

    public Address getAddress() {return address;}

    @Override
    public String toString() {
        return "Student ID{" + studentId +
                "}, Address{" + address +
                "}";
    }


    public static class Builder {
        private String studentId;
        private Address address;

        public Builder studentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress) {
            this.studentId = studentAddress.studentId;
            this.address = studentAddress.address;

            return this;
        }

        public StudentAddress build() {return new StudentAddress(this);}
    }
}
