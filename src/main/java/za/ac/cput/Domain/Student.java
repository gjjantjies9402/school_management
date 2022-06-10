/**
 * Name: Mandisa Msongelwa
 * Student number: 217149073
 * Group 28
 * Question 1 (Domain Package)
 * Student.java
 * Date: 10/06/2022
 */


package za.ac.cput.Domain;


public class Student {
    private String studentId;
    private String email;


    //private constructor
    private Student(){}

    public Student(Builder builder) {
        this.studentId = builder.studentId;
        this.email = builder.email;
    }

    //Getters, tostring
    public String getStudentId() {return studentId;}

    public String getEmail() {return email;}


    @Override
    public String toString()
    {
        return "Student ID {" + studentId +
                "}, Email {" + email +
                "}";
    }

    public static class Builder {
        private String studentId;
        private String email;


        public Builder studentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public Builder copy(Student student) {
            this.studentId = student.studentId;
            this.email = student.email;


            return this;
        }

        public Student build() {

            return new Student(this);}
    }

}
