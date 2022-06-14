package za.ac.cput.Services.Interfaces;

import za.ac.cput.Domain.City;

import java.util.List;

public interface ICityService extends IService<City, String>{

    List<City> getAll();
}
