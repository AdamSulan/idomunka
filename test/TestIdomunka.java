import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestIdomunka {
    Idomunka idomunka;
    @BeforeEach
    public void init(){
        idomunka=new Idomunka();
    }
    @Test
    public void testCheckInput(){
        boolean actual=idomunka.checkInput("33");
        assertTrue("Nem fogadja el az integer bemenetet.", actual);
    }
    @Test
    public void testCheckInputFalse(){
        boolean actual=idomunka.checkInput("12a");
        assertFalse("Elfogadja a szöveges bemenetet.", actual);
    }
    @Test
    public void testCheckInputFloat(){
        boolean actual=idomunka.checkInput("24.5");
        assertTrue("Nem fogadja el a float bemenetet.", actual);
    }
    @Test
    public void testIdomunka(){
        double actual=idomunka.szamol(10,10,1);
        assertEquals(actual, 1, 0.001, "Nem 1-et kaptam a 10, 10, 1 bemenetre.");
    }
    @Test
    public void testIdomunka2(){
        double actual=idomunka.szamol(12.25,0.125,16);
        assertEquals(actual, 6.125, 0.001, "Nem 6.125-öt kaptam a 12.5, 0.125, 16 bemenetre.");
    }
    @Test
    public void testIdomunka3(){
        double actual=idomunka.szamol(2400,4.45,1260);
        assertEquals(actual, 0.42803638309256287, 0.001, "Nem 0.42803638309256287-at kaptam a 2400, 4.45, 1260 bemenetre.");
    }
}