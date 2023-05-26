import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirportController {
    private AirportModel model;
    private AirportView view;

    public AirportController(AirportModel model, AirportView view){
        this.model = model;
        this.view = view;
        this.view.setVisible(true);
        this.view.addAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addPassenger(view.nameField(),view.surnameField(), view.dateOfBirthField(),view.luggageCount(), view.passengerType());
                view.updatePassengerList(model.passengerManagementSystem.airportPassengerArrayList);
            }
        });


        this.view.addRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removePassenger(view.selectedPassenger());
                view.updatePassengerList(model.passengerManagementSystem.airportPassengerArrayList);

            }
        });
        this.view.addUpdateButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.updatePassenger(view.selectedPassenger(),view.nameField(),view.surnameField(), view.dateOfBirthField(),view.luggageCount(), view.passengerType());
                view.updatePassengerList(model.passengerManagementSystem.airportPassengerArrayList);

            }
        });



    }


}
