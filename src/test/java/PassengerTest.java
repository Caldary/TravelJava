import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){ passenger1 = new Passenger("Sienna", 2);}

    @Test
    public void hasName(){
        passenger1.getName();
        assertEquals("Sienna", passenger1.getName());
    }

    @Test
    public void hasBags(){
        passenger1.getNumberOfBags();
        assertEquals(2, passenger1.getNumberOfBags());
    }

    @Test
    public void canSetName(){
        passenger1.setName("Sara");
        assertEquals("Sara", passenger1.getName());
    }

    @Test
    public void canSetNumberOfBags(){
        passenger1.setNumberOfBags(5);
        assertEquals(5, passenger1.getNumberOfBags());
    }
}
