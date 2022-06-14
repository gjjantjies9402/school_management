package za.ac.cput.Repository.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Name;

@Repository
public interface INameRepository extends JpaRepository<Name, String> {
}
