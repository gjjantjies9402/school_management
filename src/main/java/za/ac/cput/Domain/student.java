/**
 * Name: Mandisa Msongelwa
 * Student number: 217149073
 * Group 28
 * Question 1 (Domain Package)
 * Date: 10/06/2022
 */


package za.ac.cput.Domain;


public class student {
    private String studentId;
    private String email;
    //private Name name;


    //private constructor
    private student(){}

    public student(Builder builder) {
        this.studentId = builder.studentId;
        this.email = builder.email;
        //this.name = builder.name;
    }

    //Getters, tostring
    public String getStudentId() {return studentId;}

    public String getEmail() {return email;}

    //public Name getName() {return name;}

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
        //private Name name;

        public Builder studentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        //public Builder name(Name name) {
          //  this.name = name;
            //return this;
        //}

        public Builder copy(student student) {
            this.studentId = student.studentId;
            this.email = student.email;
           // this.name = student.name;

            return this;
        }

        public student build() {

            return new student(this);}
    }

}
