package za.ac.cput.Repository.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.City;

@Repository
public interface ICityRepository extends JpaRepository <City, String> {
}
