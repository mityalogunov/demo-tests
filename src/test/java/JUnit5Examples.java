import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {

    @BeforeAll
    static void beforeALL() {
        System.out.println("###    @BeforeALL !");
    }

    @AfterAll
    static void afterALL() {
        System.out.println("###    @AfterALL !");
    }

    @BeforeEach
    void beforeEach() {
        // open("google.com")
        System.out.println("###     @BeforeEach !");
    }

    @AfterEach
    void afterEach() {
        System.out.println("###     @AfterEach !");
    }

    @Test
    void fistTest() {
        System.out.println("###    @Test fistTest() !");
        assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("###    @Test secondTest() !");
//        assertFalse(3 > 2);
    }
}
