package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    void createName() {

        Name name = NameFactory.createName("Buko", "BK", "Ramncwana");
        assertNotNull(name);
        System.out.println(name);
    }


}