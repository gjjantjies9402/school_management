package za.ac.cput.Factory;

import za.ac.cput.Domain.Country;
/**
 CountryFactory.java
 CountryFactory
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 10 June 2022
 */
public class CountryFactory {
    public static Country createCountry(String id, String name){
        return new Country.Builder().setId(id).setName(name).build();

    }
}