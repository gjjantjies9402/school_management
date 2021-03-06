package za.ac.cput.Repository.Interfaces;
/**
 * Author: Mziyanda Mwanda 215133765
 * POJO IEmployeeAddressRepository.java
 *  EmployeeAddress Interface file to be implemented
 * Created: 12/6/2022
 * */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.EmployeeAddress;

@Repository
public interface IEmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {
}
