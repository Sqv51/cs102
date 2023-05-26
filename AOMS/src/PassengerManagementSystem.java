import java.util.ArrayList;

public class PassengerManagementSystem {
    ArrayList<AirportPassenger> airportPassengerArrayList;
     public PassengerManagementSystem(){
        this.airportPassengerArrayList = new ArrayList<AirportPassenger>();
    }

    public void addPassenger(String name, String surname,String yearOfBirth,int luggageCount, String passengerType) {
        if (passengerType.equals("Family")) {
            airportPassengerArrayList.add(new FamilyPassenger(name, surname, yearOfBirth, luggageCount, passengerType));
        }
        else if (passengerType.equals("Business")) {
            airportPassengerArrayList.add(new BusinessPassenger(name, surname, yearOfBirth, luggageCount, passengerType));
        }
        else if (passengerType.equals("Economy")) {
            airportPassengerArrayList.add(new EconomyPassenger(name, surname, yearOfBirth, luggageCount, passengerType));
        }
    }
    public void removePassenger(AirportPassenger passenger) {
        airportPassengerArrayList.remove(passenger);
    }
    public void updatePassenger(AirportPassenger passenger, String newName, String newSurname, String newYearOfBirth, int newLuggageCount, String newPassengerType) {
        int index = airportPassengerArrayList.indexOf(passenger);
        if (index != -1) {
            airportPassengerArrayList.get(index).setName(newName);
            airportPassengerArrayList.get(index).setSurname(newSurname);
            airportPassengerArrayList.get(index).setDateOfBirth(newYearOfBirth);
            airportPassengerArrayList.get(index).setLuggageKG(newLuggageCount);
            airportPassengerArrayList.get(index).setPassengerType(newPassengerType);
        }
    }




    public void passengerDetails(){}
    public String getPassengerType(AirportPassenger passenger){
        if(passenger instanceof BusinessPassenger){
            return "Business";
        } else if (passenger instanceof EconomyPassenger){
            return "Economy";
        } else if(passenger instanceof  FamilyPassenger){
            return "Family";

        }
        else {
            return "Passenger";
        }
    }
    public void luggageDetails(){}
    public String getDateOfBirth(AirportPassenger passenger){
        return passenger.getDateOfBirth();
    }
}
