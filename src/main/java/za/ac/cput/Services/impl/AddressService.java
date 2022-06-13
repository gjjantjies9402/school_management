package za.ac.cput.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.City;
import za.ac.cput.Repository.Interfaces.IAddressRepository;
import za.ac.cput.Services.Interfaces.IAddressService;

import java.util.List;

public abstract class AddressService implements IAddressService {


    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public Address create(Address address){
        return this.addressRepository.save(address);
    }


    public Address read(City city){
        return this.addressRepository.findById(city.cityId).orElse(null);
    }

    @Override
    public Address update(Address address){
        return this.addressRepository.save(address);
    }


    public boolean delete(City city){
        this.addressRepository.deleteById(city.cityId);
        return !this.addressRepository.existsById(city.cityId);
    }

    @Override
    public List<Address> getAll() {
        return this.addressRepository.findAll();
    }
}