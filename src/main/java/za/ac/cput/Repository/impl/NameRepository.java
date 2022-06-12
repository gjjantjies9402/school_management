

package za.ac.cput.Repository.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Name;
import za.ac.cput.Repository.Interfaces.INameRepository;

import java.util.List;

@Repository
public abstract class NameRepository implements INameRepository {


    public Name retrieveByLastName (String lastname){

        List<Name> names = findAll();

        return names.stream().filter(name -> name.getLastName().equalsIgnoreCase(lastname)).findAny().orElse(null);
    }
}