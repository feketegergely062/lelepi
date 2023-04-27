import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;

public class Paraleptoidtest {

    Paraleptoid paraleptoid;

    @BeforeEach
    public void test() {
        Paraleptoid paraleptoid = new Paraleptoid();

    }
    @Test
    public void testCheckInput(){
        boolean actual = paraleptoid.checkInput("02");
        assertTrue(actual);
    }
    @Test 
    public void testCheckInputFalse(){
        boolean actual = paraleptoid.checkInput("z");
       assertFalse(actual);
    }
    @Test 
    public void testCheckInputSpecial(){
        boolean actual = paraleptoid.checkInput("@");
        assertFalse(actual);
    }
    
}
