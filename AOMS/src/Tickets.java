public abstract class Tickets extends airportmanagementsystem {
    String flightDetails;
    String passengerDetails;
    String seat;
    Double basePrice;
    boolean vip;

    public Tickets(String flightDetails, String passengerDetails, String seat, Double basePrice, boolean vip) {
        this.flightDetails = flightDetails;
        this.passengerDetails = passengerDetails;
        this.seat = seat;
        this.basePrice = basePrice;
        this.vip = vip;
    }
}
