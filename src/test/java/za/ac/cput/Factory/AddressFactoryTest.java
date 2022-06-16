package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.City;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressFactoryTest {

    @Test
    void createAddress() {

        Address address = AddressFactory.createAddress("35","Tafelsig","45","Alps Street",7785,
                CityFactory.createCity("CPT", "Cape Town", CountryFactory.createCountry("ZAR", "South Africa"))
        );

        assertNotNull(address);
        System.out.println(address);
    }
}