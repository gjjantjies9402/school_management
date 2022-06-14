/*NameFactory.java
Factory for Name
Author: Kanya Ramncwana (218297521)
Date: 10 June 2022

Question 2A

 */

package za.ac.cput.Factory;

import za.ac.cput.Domain.Name;

public class NameFactory {

    public static Name createName(String firstName, String middleName, String lastName){


        return new Name.Builder()
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();

    }
}
