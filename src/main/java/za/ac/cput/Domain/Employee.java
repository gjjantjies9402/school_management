/**
 * Employee.java
 * Author: Nikitha Mbokotwana
 * Question 1: Implemenation of Employee domain and value object package
 * Group: 28
 * Created: 10/6/2022
 * */
package za.ac.cput.Domain;
import java.util.Objects;

public class Employee {
    private String staffId, email;
    private Name name;

    //Constructors
    private Employee(){}

    public Employee(Builder builder) {
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    //Getters and setters
    public String getStaffId() {
        return staffId;
    }
    public String getEmail() {
        return email;
    }
    public Name getName() {
        return name;
    }

    //toString
    @Override
    public String toString() {
        return "Employee : " + '\n' +
                "Staff Id : " + staffId  + '\n'+
                "Email : " + email + '\n' +
                "Full Name : " + name ;
    }

    //Builder pattern
    public static class Builder {
        private String staffId;
        private String email;
        private Name name;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name) {
            return this;
        }

        public Employee.Builder copy(Employee employee) {
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }

    // Check that the fields are equal
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(staffId, employee.staffId);
    }
    // Calculate hash code based on all fields
    @Override
    public int hashCode() {
        return Objects.hash(staffId);
    }*/

}

