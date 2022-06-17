//package za.ac.cput.Services.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import za.ac.cput.Domain.Address;
//import za.ac.cput.Repository.Interfaces.IAddressRepository;
//import za.ac.cput.Services.Interfaces.IAddressService;
//
//import java.util.List;
//
//public class AddressService implements IAddressService {
//    public static AddressService service = null;
//
//    @Autowired
//    private IAddressRepository addressRepository;
//
//    public static AddressService getService() {
//        if (service == null)
//            service = new AddressService();
//        return service;
//    }
//
//    @Override
//    public Address create(Address address){
//        return this.addressRepository.save(address);
//    }
//
//    @Override
//    public Address read(String id) {
//        return this.addressRepository.findById(id).orElse(null);
//    }
//
//
////    public Address read(City city){
////        return this.addressRepository.findById(city.cityId).orElse(null);
////    }
//
//    @Override
//    public Address update(Address address){
//        return this.addressRepository.save(address);
//    }
//
//    @Override
//    public boolean delete(String id) {
//        this.addressRepository.deleteById(id);
//        return !this.addressRepository.existsById(id);
//    }
//
//
////    public boolean delete(City city){
////        this.addressRepository.deleteById(city.cityId);
////        return !this.addressRepository.existsById(city.cityId);
////    }
//
//    @Override
//    public List<Address> getAll() {
//        return this.addressRepository.findAll();
//    }
//}