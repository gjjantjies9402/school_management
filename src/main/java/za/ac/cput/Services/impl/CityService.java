package za.ac.cput.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Domain.City;
import za.ac.cput.Domain.Country;
import za.ac.cput.Services.Interfaces.ICityService;

public abstract class CityService implements ICityService {

    @Autowired
    private ICityRepository cityRepository;

    @Override
    public City create (City city){
        return this.cityRepository.update(city);
    }

    public City read (Country country){
        return this.cityRepository
    }
}
