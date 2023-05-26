

public class AirportModel {
    PassengerManagementSystem passengerManagementSystem = new PassengerManagementSystem();


    public void addPassenger(String name, String surname,String yearOfBirth,int luggageCount, String type){
        passengerManagementSystem.addPassenger(name,surname,yearOfBirth,luggageCount,type);
    }
    public void removePassenger(AirportPassenger passenger){
        passengerManagementSystem.removePassenger(passenger);
    }
    public void updatePassenger(AirportPassenger passenger,String name, String surname,String yearOfBirth,int luggageCount, String type){
        passengerManagementSystem.updatePassenger(passenger,name,surname,yearOfBirth,luggageCount,type);
    }


}
