import java.util.ArrayList;

public class Flight {
    private ArrayList<Booked> bookedPassengers;
    private int flightNumber;
    private String destination;
    private String origin;
    private String departureTime;

    public Flight(int flightNumber, String destination, String origin, String departureTime){
        this.bookedPassengers = new ArrayList<Booked>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
    }

}
