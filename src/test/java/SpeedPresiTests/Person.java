package SpeedPresiTests;

import java.util.UUID;

/**
 * Dastekin created on 13.12.2022 the Person-Class inside the package - PACKAGE_NAME
 */

public class Person implements PersonService{

    private long id;
    private String firstname;
    private String lastname;
    private UUID uuid;
    private String ssn;

    public Person(long id, String firstname, String lastname, UUID uuid, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.uuid = uuid;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Person() {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.uuid = uuid;
        this.ssn = ssn;
    }

    public Person(String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.uuid = uuid;
        this.ssn = ssn;
    }


    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public void setLastname(String lastname) {
    }


    public void setID(UUID myUUid) {
        this.uuid = uuid;
    }


    public void setSsn(String valueOf) {
        this.ssn = valueOf;
    }

    public void proposeTo(Person alice) {
    }

    public void setId(long l) {
        this.id= l;
    }

    @Override
    public Person createPerson(String firstname, String lastname) {
        return new Person(this.firstname,this.lastname);
    }

    public void isInLoveWith(Person billy) {

    }
}
