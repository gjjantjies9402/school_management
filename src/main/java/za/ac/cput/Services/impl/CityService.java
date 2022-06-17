package za.ac.cput.Services.impl;
/**
 * Author: Mziyanda Mwanda 215133765
 * POJO CityService.java
 *  City Service file to be implemented
 * Created: 13/6/2022
 * */
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Domain.City;
import za.ac.cput.Domain.Country;
import za.ac.cput.Repository.Interfaces.ICityRepository;
import za.ac.cput.Services.Interfaces.ICityService;

import java.util.List;

public abstract class CityService implements ICityService {

    @Autowired
    private ICityRepository cityRepository;

    @Override
    public City create (City city){
        return this.cityRepository.save(city);
    }

    public City read (Country country){
        return this.cityRepository.findById(country.getId()).orElse(null);
    }

    @Override
    public City update(City city){
        return this.cityRepository.save(city);
    }

    public boolean delete(Country country){
        this.cityRepository.deleteById(country.getId());
        return !this.cityRepository.existsById(country.getId());
    }

    @Override
    public List<City> getAll(){
        return this.cityRepository.findAll();
    }
}
