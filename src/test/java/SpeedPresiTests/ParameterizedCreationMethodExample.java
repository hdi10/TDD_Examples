//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//
//import java.util.UUID;
//
///**
// * Dastekin created on 13.12.2022 the ParameterizedCreationMethodExample-Class inside the package - PACKAGE_NAME
// */
//
//public class ParameterizedCreationMethodExample {
//
//    private Person alice, billy, clark;
//
//    private UUID myUUid= UUID.randomUUID();
//
//    @Before
//    public void setup() throws Exception{
//        clark = createPerson("Clark","Cable");
//        alice = createPerson("Alice","Adams");
//        billy = createPerson("Billy","Burke");
//
//        alice.isInLoveWith(billy);
//    }
//
//    private Person createPerson(String firstName, String lastname) {
//        Person person = new Person();
//        person.setFirstname(firstName);
//        person.setLastname(lastname);
//        person.setID(myUUid);
//        person.setSsn(String.valueOf(myUUid));
//        /// oder
//        person.setID(myUUid);
//        person.setSsn(String.valueOf(myUUid));
//
//        return person;
//    }
//
//    @Test
//    public void aliceShouldAcceptWhenProposedToByBilly() throws Exception {
//        billy.proposeTo(alice);
//        Assert.assertTrue(aliceIsEngagedWith(billy));
//    }
//
//    private boolean aliceIsEngagedWith(Person billy) {
//        this.billy = new PersonService() {
//            @Override
//            public Person createPerson(String firstname, String lastname) {
//                return new Person(firstname,lastname);
//            }
//
//            @Override
//            public void isInLoveWith(Person person) {
//                person.isInLoveWith(person);
//            }
//        }.createPerson("hier","da");
//        this.billy=billy;
//
//        return true;
//    }
//}
