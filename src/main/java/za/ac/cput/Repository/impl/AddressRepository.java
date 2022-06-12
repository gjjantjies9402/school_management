package za.ac.cput.Repository.impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Address;
import za.ac.cput.Repository.Interfaces.IAddressRepository;

import java.util.*;

@Repository
public abstract class AddressRepository implements IAddressRepository {

    private static AddressRepository addressRepository = null;
    private List<Address> addressRepositoryDB = null;

    private AddressRepository(){
        addressRepositoryDB = new ArrayList<Address>();
    }
//
//    public static AddressRepository getAddressRepository(){
//
//        if (addressRepository == null)
////            addressRepository = new AddressRepository() {
//                @Override
//                public List<Address> findAll() {
//                    return null;
//                }
//
//
//            };
//
//        return addressRepository;
//    }

    public Address create(Address addresss) {
        boolean created = addressRepositoryDB.add(addresss);
        if(created)
            return addresss;
        else
            return null;
    }


    public Address read(String address) {
        for (Address add: addressRepositoryDB) {
            if (add.getCity().getCityId() == address)
                return add;
        }
        return null;
    }


    public Address update(Address a) {
        Address oldAddress = read(a.getCity().getCityId());
        if (oldAddress != null){
            addressRepositoryDB.remove(oldAddress);
            addressRepositoryDB.add(a);
            return a;
        }
        return null;
    }


public void delete(String s) {
        Address delAddress = read(s);
        if (delAddress != null) {
            this.addressRepositoryDB.remove(delAddress);
        }
    }
    public List<Address> getAll() {
        return addressRepositoryDB;
    }
}
