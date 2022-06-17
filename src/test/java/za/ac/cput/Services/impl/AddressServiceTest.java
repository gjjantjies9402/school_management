//package za.ac.cput.Services.impl;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.Domain.Address;
//import za.ac.cput.Factory.AddressFactory;
//import za.ac.cput.Factory.CityFactory;
//import za.ac.cput.Factory.CountryFactory;
//import za.ac.cput.Repository.Interfaces.IAddressRepository;
//import za.ac.cput.Services.Interfaces.IAddressService;
//
//import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
//
//class AddressServiceTest {
//
//    private static IAddressService service = AddressService.getService();
//
//    private static Address address = AddressFactory.createAddress("35","Tafelsig","45","Alps Street",7785,
//            CityFactory.createCity("CPT", "Cape Town", CountryFactory.createCountry("ZAR", "South Africa"))
//    );
//    //instantiate factory
//
//    @Test
//    void a_create() {
//        Address create = service.create(address);
//        assertEquals(address.getUnitNumber(), create.getUnitNumber());
//        System.out.println("Created: " + create);
//    }
//    @Test
//    void b_read() {
//        Address read = service.read(address.getCity().getCityId());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//    @Test
//    void c_update() {
//        Address update = new Address.Builder().copy(address).setPostalCode(7898).build();
//        update = service.update(update);
//        zassertEquals(address.getCity().getCityId(), update.getCity().getCityId());
//        System.out.println("Updated: " + update);
//    }
//    @Test
//    void d_getAll() {
//        assertEquals(1, service.getAll().size());
//        System.out.println("All Addresses: " + service.getAll());
//    }
//    @Test
//    void e_delete() {
//        boolean delete = service.delete(address.getCity().getCityId());
//        assertTrue(delete);
//        System.out.println("Deleted: " + delete);
//    }
//}