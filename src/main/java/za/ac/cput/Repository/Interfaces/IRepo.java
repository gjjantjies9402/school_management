package za.ac.cput.Repository.Interfaces;

import java.util.Optional;

public interface IRepo <T, ID>{
    T save(T t);
    Optional<T> read(ID id);
    void delete(T t);
}
