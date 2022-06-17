package za.ac.cput.Services.Interfaces;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Address;
import za.ac.cput.Services.IService;

import java.util.List;

public interface IAddressService extends IService<Address, String> {
    List<Address> getAll();
}
