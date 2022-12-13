import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * Dastekin created on 13.12.2022 the Tests_With_Before-Class inside the package - PACKAGE_NAME
 */

public class BeforeTests {



    @Before
    public void setUp(){
        alice = new Person();
        alice.setId(1L);
        alice.setFirstname("Alice");
        alice.setLastname("Adams");
        alice.setSsn("111111");

        billy = new Person();
        billy.setId(2L);
        billy.setFirstname("Billy");
        billy.setLastname("Burke");
        billy.setSsn("222222");

        clark = new Person();
        clark.setId(3L);
        clark.setFirstname("Clark");
        clark.setLastname("Cable");
        clark.setSsn("333333");

    }

    @Test
    public void gutTest1(){

    }
}
