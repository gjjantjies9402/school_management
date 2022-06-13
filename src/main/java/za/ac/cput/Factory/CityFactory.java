package za.ac.cput.Factory;

import za.ac.cput.Domain.City;
import za.ac.cput.Domain.Country;

public class CityFactory {

    public static City createCity(String cityId, String cityName, Country country){

        City cities = new City.Builder()
                .setCityId(cityId)
                .setCityName(cityName)
                .setCountry(country)
                .build();

        return cities;
    }
}
