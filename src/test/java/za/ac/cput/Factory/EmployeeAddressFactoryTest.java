package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.EmployeeAddress;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    void createEmployeeAddress() {
        EmployeeAddress empAddress = EmployeeAddressFactory.createEmployeeAddress("x1077495",
                AddressFactory.createAddress("35","Tafelsig","45","Alps Street",7785,
                        CityFactory.createCity("CPT", "Cape Town",
                CountryFactory.createCountry("ZAR", "South Africa"))));

        assertNotNull(empAddress);
        System.out.println("Employee Address: " + '\n' + empAddress);
    }
}