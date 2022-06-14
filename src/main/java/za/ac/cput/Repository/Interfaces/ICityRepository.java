package za.ac.cput.Repository.Interfaces;
/**
 * Author: Mziyanda Mwanda 215133765
 * POJO ICityRepository.java
 *  City Interface file to be implemented
 * Created: 12/6/2022
 * */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.City;

@Repository
public interface ICityRepository extends JpaRepository <City, String> {
}
