package za.ac.cput.Repository.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.City;
import za.ac.cput.Repository.Interfaces.ICityRepository;

import java.util.List;

@Repository
public abstract class CityRepository implements ICityRepository {

    public City retrieveCity (String city){
        List<City> cities = findAll();

        return cities.stream().findAny().orElse(null);
    }
}
