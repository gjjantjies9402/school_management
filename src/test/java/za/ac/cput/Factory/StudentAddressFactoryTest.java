package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.StudentAddress;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentAddressFactoryTest {

    @Test
    void buildStudentAddress() {

        StudentAddress studentAddress = StudentAddressFactory.buildStudentAddress("Mso101",
                AddressFactory.createAddress("35",
                        "Tafelsig","45","Alps Street",7785,
                        CityFactory.createCity("CPT", "Cape Town",
                                CountryFactory.createCountry("ZAR", "South Africa"))));
        assertNotNull(studentAddress);
        System.out.println("Student Address" + studentAddress);
    }
}
