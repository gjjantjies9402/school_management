package za.ac.cput.Factory;

import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.City;

/**
 * Author: GAYNOR JANTJIES 213069555
 * Factory class for creating instances of Address.Class
 * Created: 10/6/2022
 * */
public class AddressFactory {

    public static Address createAddress(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode, City city)

    {

        Address address = new Address.Builder()
                .setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setPostalCode(postalCode)
                .setCity(city)
                .build();


        return address;
    }

}
