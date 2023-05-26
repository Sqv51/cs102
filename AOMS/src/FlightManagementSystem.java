import java.util.ArrayList;

public class FlightManagementSystem extends airportmanagementsystem{
    ArrayList<Flight> flightArrayList;
    ArrayList<Tickets> ticketsArrayList;
    public void generateFlight(Flight flight){
        this.flightArrayList.add(flight);

    }
    public void removeFlights(Flight flight){
        this.removeFlights(flight);
    }

    public ArrayList<Flight> currentFlights(){
        return this.flightArrayList;

    }
    public String flightDetails(Flight flight){

        return flight.toString();
    }


    public void buyTicket(AirportPassenger passenger,Flight flight,String seat,Double price,boolean vip){
        if(vip){
            ticketsArrayList.add(new VipTicket(flight.toString(),passenger.toString(),seat,price,vip));
        }
        else {
            ticketsArrayList.add(new RegularTicket(flight.toString(),passenger.toString(),seat,price,vip));
        }

    }
    public void cancelTicket(Tickets ticket){
        ticketsArrayList.remove(ticket);
    }

}
