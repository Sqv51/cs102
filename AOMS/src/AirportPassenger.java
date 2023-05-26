public abstract class AirportPassenger extends PassengerManagementSystem {
    String passengerID;
    String name;
    String surname;
    int luggageKG;
    String dateOfBirth;

    String passengerType = getPassengerType();

    private String getPassengerType(){
        if(this instanceof BusinessPassenger){
            return "Business";
        } else if (this instanceof  EconomyPassenger) {
            return  "Economy";
        } else if (this instanceof FamilyPassenger) {
            return  "Family";
        }
        else return "None Type";
    }
    public void setPassengerType(String passengerType){
        this.passengerType = passengerType;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getLuggageKG() {
        return luggageKG;
    }

    public void setLuggageKG(int luggageKG) {
        this.luggageKG = luggageKG;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AirportPassenger(String passengerID, String name, String surname, int luggageKG, String dateOfBirth) {
        this.passengerID = passengerID;
        this.name = name;
        this.surname = surname;
        this.luggageKG = luggageKG;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "AirportPassenger{" +
                "passengerID='" + passengerID + '\'' +
                ", Name: '" + name + '\'' +
                ", Surname: '" + surname + '\'' +
                ", Luggage KG: " + luggageKG +
                ", Date of Birth: '" + dateOfBirth + '\'' +
                "} " ;
    }


}
