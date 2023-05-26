

public class Flight {
    String flightID;
    String departure;
    String landing;
    String departureDate;
    String returnDate;

    public Flight(String flightID, String departure, String landing, String departureDate, String returnDate) {
        this.flightID = flightID;
        this.departure = departure;
        this.landing = landing;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }


    public String toString() {
        return "Flight{" +
                "Flight ID='" + flightID + '\'' +
                ", Departure='" + departure + '\'' +
                ", Landing='" + landing + '\'' +
                ", DepartureDate='" + departureDate + '\'' +
                ", ReturnDate='" + returnDate + '\'' +
                '}';
    }
}
