import java.util.ArrayList;

public class Car {

    //Variables
    private String make;
    private String model;
    private int year;
    private String color;
    private int milesOnTheOdometer;

    //Constructor
    public Car(String make, String model, int year, String color, int milesOnTheOdometer) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.milesOnTheOdometer = milesOnTheOdometer;

    }

    // A/N: Method to add veh info to an index?
    //Methods

    //Attempting Override for toString() to help make data manipulation easier
    @Override
    public String toString() {
        return "Car{" +
                "A Car" + carList +
                '}';
    }

    //Array Set up
    ArrayList<Car> carList = new ArrayList<>();


    // Maybe set up a constructor to assist with the print?
    // this was just printing the list of the car, but no saving.
    public String printList() {
        String results = "You added: " + this.make + "," + this.model + "," + this.year + "," + this.color + "," + this.milesOnTheOdometer + " ";
        for (int i = 0; i < this.carList.size(); i++) {
            results += " " + this.carList.get(i);
        }
        return results;

    }

    //GetSet
    public String getMake() { return this.make;}
    public void setMake(String make) { this.make = make;}

    public String getModel() { return this.model;}
    public void setModel(String model) { this.model = model;}

    public int setyear() { return this.year;}
    public void setYear(int year) { this.year = year;}

    public String setColor() { return this.color;}
    public void getColor() { this.color = color;}

    public int getMilesOnTheOdometer() { return this.milesOnTheOdometer;}
    public void setMilesOnTheOdometer(int milesOnTheOdometer) { this.milesOnTheOdometer = milesOnTheOdometer;}
}
