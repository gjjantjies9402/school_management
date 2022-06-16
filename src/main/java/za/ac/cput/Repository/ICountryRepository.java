package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Country;


@Repository
public interface ICountryRepository extends JpaRepository<Country, String> {
}
