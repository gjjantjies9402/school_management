package za.ac.cput.Factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Student;
import za.ac.cput.Domain.City;
import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.StudentAddress;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAddressFactoryTest {

    @Test
    void buildStudentAddress() {
        City cape = null;
        StudentAddress studentAddress = StudentAddressFactory.buildStudentAddress("Mso101", AddressFactory.createAddress("35","Tafelsig","45","Alps Street","7785",cape));
        assertNotNull(studentAddress);
        System.out.println("Student Address" + studentAddress);
    }
}
