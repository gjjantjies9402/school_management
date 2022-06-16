package za.ac.cput.Services.Interfaces;

import za.ac.cput.Domain.Country;

import java.util.List;

public interface ICountryService extends IService <Country, String>{
    List<Country> getAll();
}
