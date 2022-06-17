package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void createEmployee(){
        Employee employee = EmployeeFactory.createEmployee("22335566", "nikitha@gmail.com",
                NameFactory.createName("Buko", "BK", "Ramncwana"));
        assertNotNull(employee);
        System.out.println(employee);
    }
}
