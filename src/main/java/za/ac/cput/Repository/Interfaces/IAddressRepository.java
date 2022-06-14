package za.ac.cput.Repository.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Address;

@Repository
public interface IAddressRepository extends JpaRepository <Address, String> {

}
