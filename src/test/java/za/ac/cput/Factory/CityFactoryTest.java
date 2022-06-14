package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.City;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {

    @Test
    void createCity() {

        City cities = CityFactory.createCity("CPT", "Cape Town",
                CountryFactory.createCountry("ZAR", "South Africa"));

        assertNotNull(cities);
        System.out.println("City :" + '\n' + cities);
    }
}