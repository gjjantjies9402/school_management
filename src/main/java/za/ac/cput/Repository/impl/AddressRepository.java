package za.ac.cput.Repository.impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Address;
import za.ac.cput.Domain.City;
import za.ac.cput.Domain.Name;
import za.ac.cput.Repository.Interfaces.IAddressRepository;

import java.util.*;

@Repository
public abstract class AddressRepository implements IAddressRepository {

    public Address fetchAddress (String address){

        List<Address> addresses = findAll();

        return addresses.stream().findAny().orElse(null);
    }
}
