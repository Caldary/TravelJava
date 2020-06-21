import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {
    Plane plane;
    Passenger passenger;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(Plane.PRIVATEJET);
        passenger = new Passenger("Sienna", 2);
        flight = new Flight("Bermuda", "Edinburgh", "12:00");
    }
}
