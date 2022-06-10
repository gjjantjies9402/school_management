/**
 * Name: Mandisa Msongelwa
 * Student number: 217149073
 * Group 28
 * Question 2a (Factory Package)
 * StudentFactory.java
 * Date: 10/06/2022
 */

package za.ac.cput.Factory;

import za.ac.cput.Domain.Student;
import za.ac.cput.Domain.Name;

public class StudentFactory {

    public static Student buildStudent(String studentId, String email, Name name) {
        return new Student.Builder()
                .studentId(studentId)
                .email(email)
                .name(name)
                .build();
    }
}
