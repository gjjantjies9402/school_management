package za.ac.cput.Repository.impl;
/**
 * Author: Mziyanda Mwanda 215133765
 * POJO CityRepository.java
 *  City Repository file to be implemented
 * Created: 12/6/2022
 * */
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
