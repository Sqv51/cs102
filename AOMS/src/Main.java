


public class Main {
    public static void main(String[] args) {

        AirportView view = new AirportView();
        AirportModel model = new AirportModel();
        AirportController controller = new AirportController(model,view);



    }
}