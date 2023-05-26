import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class AirportView extends JFrame {
    private final JSpinner inputLuggageField;
    private final JTextField inputBirthField;
    private final JPanel passengerManagementPanel;
    private final JPanel titledPanel;
    private final JPanel allPassengerPanel;
    private final JPanel titledPanel2;
    private final JList<AirportPassenger> passengerJList;
    private final JButton addhanger;
    private final JButton removehanger;
    private final JButton addrunway;
    private final JButton removerunway;
    private final JButton reservehanger;
    private final JButton resethanger;
    private final JButton reserverunway;
    private final JButton resetrunway;
    private final JTextField inputSurnameField;
    private final JTextField allPlanesField;
    private final JButton addplanebutton;
    private final JTextField inputrunway;
    private final JTextField inputlanddate;
    private final JTextField allseats;
    private final JButton cancelticket;
    private final JTextField inputid;
    private final JButton buyticket;
    private final JButton addflight;
    private final JTextField inputland;
    private final JButton removeflight;
    private final JTextField inputdepdate;
    private final JTextField inputplanecode;
    private final JButton removeplane;
    private final JTextField allhangers;
    private final JTextField allrunways;
    private final JTextField inputdep;
    private final JTextField inputhanger;
    private final JTextField allflights;
    private final JTextField price;
    private final JComboBox<String> comboboxPassengerType;
    private  JTextField inputNameField;
    private JTabbedPane tabbedPane;
    private JPanel flightManagement;
    private JPanel passengerManagement;
    private JPanel planeManagement;

    private JButton addUserButton, removeUserButton,updateUserButton;
    private DefaultListModel<AirportPassenger> listModel;

    public AirportView(){
        setTitle("Airport Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100,600);
        setLayout(new BorderLayout());
        tabbedPane=new JTabbedPane();
        flightManagement =new JPanel();
        passengerManagement =new JPanel();
        planeManagement =new JPanel();
        tabbedPane.addTab("Flight Management System", flightManagement);
        tabbedPane.addTab("Passenger Management System", passengerManagement);
        tabbedPane.addTab("Plane Management System", planeManagement);
        add(tabbedPane, BorderLayout.CENTER);

        //PASSENGER MANAGEMENT


        passengerManagementPanel = new JPanel();
        passengerManagementPanel.setBackground(Color.WHITE);
        passengerManagementPanel.setPreferredSize(new Dimension(1000, 600));
        titledPanel = new JPanel();
        titledPanel.setLayout(new BorderLayout());
        titledPanel.setBorder(BorderFactory.createTitledBorder("     Passenger Management"));
        titledPanel.add(passengerManagementPanel, BorderLayout.CENTER);
        passengerManagement.add(titledPanel, BorderLayout.CENTER);

        allPassengerPanel = new JPanel();
        allPassengerPanel.setBackground(Color.WHITE);
        allPassengerPanel.setPreferredSize(new Dimension(1000, 180));
        titledPanel2 = new JPanel();
        titledPanel2.setLayout(new BorderLayout());
        titledPanel2.setBorder(BorderFactory.createTitledBorder("     All Passengers"));
        titledPanel2.add(allPassengerPanel, BorderLayout.CENTER);
        passengerManagementPanel.add(titledPanel2,BorderLayout.NORTH);



        JPanel newUserPanel = new JPanel();
        newUserPanel.setBackground(Color.WHITE);
        newUserPanel.setPreferredSize(new Dimension(1000, 120));
        JPanel titledPanel3 = new JPanel();
        titledPanel3.setLayout(new BorderLayout());
        titledPanel3.setBorder(BorderFactory.createTitledBorder("     Create a New User"));
        titledPanel3.add(newUserPanel, BorderLayout.CENTER);
        passengerManagementPanel.add(titledPanel3,BorderLayout.CENTER);

        JPanel buttonPanel= new JPanel();
        addUserButton= new JButton("Add User");
        removeUserButton= new JButton("Remove User");
        updateUserButton= new JButton("Update User");
        addUserButton.setPreferredSize(new Dimension(1000,30));
        removeUserButton.setPreferredSize(new Dimension(1000,30));
        updateUserButton.setPreferredSize(new Dimension(1000,30));
        buttonPanel.setPreferredSize(new Dimension(1000,180));
        buttonPanel.add(addUserButton,BorderLayout.NORTH);
        buttonPanel.add(removeUserButton,BorderLayout.CENTER);
        buttonPanel.add(updateUserButton,BorderLayout.NORTH);
        passengerManagementPanel.add(buttonPanel,BorderLayout.SOUTH);

        passengerJList = new JList<AirportPassenger>();
        passengerJList.setPreferredSize(new Dimension(400,170));
        allPassengerPanel.add(passengerJList,BorderLayout.CENTER);

        JPanel category= new JPanel();
        category.setPreferredSize(new Dimension(990,50));
        category.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        JLabel name= new JLabel("Name");
        name.setPreferredSize(new Dimension(180,30));
        JLabel surname= new JLabel("Surname");
        surname.setPreferredSize(new Dimension(180,30));
        JLabel passengerTypeLabel= new JLabel("Passenger Type");
        passengerTypeLabel.setPreferredSize(new Dimension(180,30));
        JLabel luggage= new JLabel("Luggage Count");
        luggage.setPreferredSize(new Dimension(180,30));
        JLabel birth= new JLabel("Date of Birth");
        birth.setPreferredSize(new Dimension(160,30));
        category.add(name);
        category.add(surname);
        category.add(passengerTypeLabel);
        category.add(luggage);
        category.add(birth);
        newUserPanel.add(category,BorderLayout.NORTH);

        JPanel inputPanel= new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        inputNameField= new JTextField();
        inputNameField.setPreferredSize(new Dimension(180,30));
        inputSurnameField= new JTextField();
        inputSurnameField.setPreferredSize(new Dimension(180,30));
        String[] types = {"Business", "Economy", "Family"};
        comboboxPassengerType = new JComboBox<>(types);
        comboboxPassengerType.setPreferredSize(new Dimension(180,30));
        inputLuggageField= new JSpinner();
        inputLuggageField.setPreferredSize(new Dimension(180,30));
        inputBirthField = new JTextField();
        inputBirthField.setPreferredSize(new Dimension(180,30));
        inputPanel.add(inputNameField);
        inputPanel.add(inputSurnameField);
        inputPanel.add(comboboxPassengerType);
        inputPanel.add(inputLuggageField);
        inputPanel.add(inputBirthField);
        newUserPanel.add(inputPanel,BorderLayout.SOUTH);

        //PLANE MANAGEMENT

        allPlanesField=new JTextField();
        allPlanesField.setPreferredSize(new Dimension(1000,200));
        planeManagement.add(allPlanesField,BorderLayout.NORTH);

        JPanel planePanel= new JPanel();
        planePanel.setLayout(new BorderLayout());
        planePanel.setPreferredSize(new Dimension(1000,120));
        JPanel addPlane=new JPanel();
        addPlane.setLayout(new FlowLayout(FlowLayout.CENTER));
        addPlane.setPreferredSize(new Dimension(1000,100));
        inputplanecode=new JTextField();
        inputplanecode.setPreferredSize((new Dimension(130,30)));
        addplanebutton= new JButton("Add Plane");
        addplanebutton.setPreferredSize((new Dimension(130,30)));
        JLabel caplabel=new JLabel("Capacity:");
        caplabel.setPreferredSize((new Dimension(60,30)));
        SpinnerModel spinnermodel= new SpinnerNumberModel(1,1,200,1);
        JSpinner inputcapacity= new JSpinner(spinnermodel);
        inputcapacity.setPreferredSize(new Dimension(130,30));
        addPlane.add(inputplanecode);
        addPlane.add(addplanebutton);
        addPlane.add(caplabel);
        addPlane.add(inputcapacity);
        planePanel.add(addPlane,BorderLayout.NORTH);
        planeManagement.add(planePanel,BorderLayout.CENTER);
        String[] planeCodes = new String[1000000];
        for (int i = 0; i < planeCodes.length; i++) {
            planeCodes[i] = "TK"+String.format("%06d", i);
        }
        SpinnerModel spinnerModel = new SpinnerListModel(planeCodes);
        JSpinner spinner = new JSpinner(spinnerModel);
        JPanel removeplanepanel= new JPanel();
        spinner.setPreferredSize(new Dimension(100,25));
        removeplanepanel.add(spinner,BorderLayout.CENTER);
        removeplane=new JButton("Remove Plane");
        removeplane.setPreferredSize(new Dimension(200,25));
        removeplanepanel.add(removeplane,BorderLayout.EAST);
        planePanel.add(removeplanepanel,BorderLayout.AFTER_LAST_LINE);
        JPanel runwaypanel= new JPanel();
        runwaypanel.setLayout(new BorderLayout());
        JPanel runwaycontentpanel=new JPanel();
        runwaycontentpanel.setPreferredSize(new Dimension(1000,180));
        runwaypanel.setBorder(BorderFactory.createTitledBorder("     Airport"));
        runwaypanel.add(runwaycontentpanel,BorderLayout.CENTER);
        planeManagement.add(runwaypanel,BorderLayout.SOUTH);
        runwaycontentpanel.setLayout(new GridLayout(4,3));
        addhanger=new JButton("Add Hanger");
        removehanger=new JButton("Remove Hanger");
        addrunway=new JButton("Add Runway");
        removerunway=new JButton("Remove Runway");
        reservehanger=new JButton("Reserve Hanger");
        resethanger=new JButton("Reset Hanger");
        reserverunway=new JButton("Reserve Runway");
        resetrunway=new JButton("Reset Runway");
        inputhanger=new JTextField();
        inputrunway=new JTextField();
        allhangers=new JTextField();
        allrunways=new JTextField();
        runwaycontentpanel.add(inputhanger);
        runwaycontentpanel.add(addhanger);
        runwaycontentpanel.add(removehanger);
        runwaycontentpanel.add(inputrunway);
        runwaycontentpanel.add(addrunway);
        runwaycontentpanel.add(removerunway);
        runwaycontentpanel.add(allhangers);
        runwaycontentpanel.add(reservehanger);
        runwaycontentpanel.add(resethanger);
        runwaycontentpanel.add(allrunways);
        runwaycontentpanel.add(reserverunway);
        runwaycontentpanel.add(resetrunway);

        //FLIGHT MANAGEMENT
        JPanel flightpanel=new JPanel();
        flightManagement.setLayout(new FlowLayout(FlowLayout.LEFT,1,100));
        flightpanel.setPreferredSize(new Dimension(375,120));
        JPanel flightcontentpanel= new JPanel();
        flightcontentpanel.setPreferredSize(new Dimension(375,120));
        flightpanel.setLayout(new BorderLayout());
        flightpanel.setBorder(BorderFactory.createTitledBorder("     Generate Flight"));
        flightpanel.add(flightcontentpanel,BorderLayout.CENTER);
        JPanel inputcategory= new JPanel();
        inputcategory.setPreferredSize(new Dimension(360,60));
        inputcategory.setLayout(new GridLayout(2,4));
        inputcategory.add(new JLabel("Departure"));
        inputcategory.add(new JLabel("Landing"));
        inputcategory.add(new JLabel("Departure Date"));
        inputcategory.add(new JLabel("Return Date"));
        inputdep= new JTextField();
        inputland= new JTextField();
        inputdepdate= new JTextField();
        inputlanddate= new JTextField();
        inputcategory.add(inputdep);
        inputcategory.add(inputland);
        inputcategory.add(inputdepdate);
        inputcategory.add(inputlanddate);
        flightcontentpanel.add(inputcategory);
        JPanel flightbuttonpanel=new JPanel();
        addflight=new JButton("Add Flight");
        addflight.setPreferredSize(new Dimension(170,20));
        removeflight=new JButton("Remove Flight");
        removeflight.setPreferredSize(new Dimension(170,20));
        flightcontentpanel.add(addflight);
        flightcontentpanel.add(removeflight);
        flightManagement.add(flightpanel);
        JPanel currentflights= new JPanel();
        currentflights.setLayout(new BorderLayout());
        currentflights.setBorder(BorderFactory.createTitledBorder("   Current Flights"));
        currentflights.setPreferredSize(new Dimension(300,180));
        allflights= new JTextField();
        allflights.setPreferredSize(new Dimension(280,150));
        currentflights.add(allflights);
        flightManagement.add(currentflights);
        JPanel ticketpanel=new JPanel();
        ticketpanel.setLayout(new BorderLayout());
        ticketpanel.setBorder(BorderFactory.createTitledBorder("   Manage Tickets"));
        ticketpanel.setPreferredSize(new Dimension(400,400));
        allseats=new JTextField();
        allseats.setPreferredSize(new Dimension(150,200));
        ticketpanel.add(allseats,BorderLayout.NORTH);
        flightManagement.add(ticketpanel);
        JPanel flightinputpanel=new JPanel();
        flightinputpanel.setPreferredSize(new Dimension(400,180));
        flightinputpanel.setLayout(new GridLayout(2,3));
        flightinputpanel.add(new JLabel("Passenger ID"));
        flightinputpanel.add(new JLabel("Ticket Price:",FlowLayout.LEFT));

        price=new JTextField();
        flightinputpanel.add(price);
        inputid=new JTextField();
        flightinputpanel.add(inputid);
        buyticket= new JButton("Buy Ticket");
        cancelticket= new JButton("Cancel Ticket");
        flightinputpanel.add(buyticket);
        flightinputpanel.add(cancelticket);
        ticketpanel.add(flightinputpanel);
        setVisible(true);


    }
    public void addAddButtonListener(ActionListener listenForAddButton) {
        addUserButton.addActionListener(listenForAddButton);
    }
    public void addRemoveButtonListener(ActionListener listenForRemoveButton) {
        removeUserButton.addActionListener(listenForRemoveButton);
    }

    public void addUpdateButtonListener(ActionListener listenForUpdateButton) {
        updateUserButton.addActionListener(listenForUpdateButton);
    }
    public String nameField(){
        return inputNameField.getText();
    }
    public String surnameField(){
        return inputSurnameField.getText();
    }
    public String dateOfBirthField(){return  inputBirthField.getText();}
    public int luggageCount(){return  inputLuggageField.getComponentCount();}
    public String passengerType(){return comboboxPassengerType.getSelectedItem().toString(); }

    public void updatePassengerList(ArrayList<AirportPassenger> passengerList) {
        listModel = new DefaultListModel<>();

        for (AirportPassenger passenger : passengerList) {
            listModel.addElement(passenger);
        }
        if(passengerList != null){
            passengerJList.setModel(listModel);
        }
        else {
            passengerJList.setModel(listModel);
        }

    }
    public AirportPassenger selectedPassenger(){
        return passengerJList.getSelectedValue();
    }
}
