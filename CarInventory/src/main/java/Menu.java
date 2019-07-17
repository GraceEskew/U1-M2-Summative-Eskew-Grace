import java.util.ArrayList;
import java.util.Scanner;

/*I originally had set up the Menu class to be a method to keep my code cleaner, but I couldn't figure out
 * a way of doing the do while loop, with the method (yet). Code was kept in because when I tried ignoring it,
 * everything went red.*/

public class Menu {
    public void printHeader() {
        System.out.println("---------------------------------------");
        System.out.println("|        Welcome to CarShoppe         |");
        System.out.println("|                                     |");
        System.out.println("---------------------------------------");
    }

    public void printMenu() {
        System.out.println("Press 1 & Enter to add a vehicle to the inventory.");
        System.out.println("Press 2 & Enter to delete a vehicle from the inventory.");
        System.out.println("Press 3 & Enter to view current inventory.");
        System.out.println("Press 4 & Enter to search the current inventory.");
        System.out.println("Press 5 & Enter to exit CarShoppe.");
        System.out.print("Please make a selection:");
    }

    public void listVeh() {
        ArrayList<Car> carList = new ArrayList<>();
        for(int i=0;i<5;i++){
            addVeh();
        }
        System.out.println(carList.toArray());
    }

    public void addVeh() {
        //Empty ArrayList
        ArrayList<Car> carList = new ArrayList<>();

        //Creates instance for Menu
        Menu menu = new Menu();


        //User inputs
        Scanner newCar = new Scanner(System.in);
        Scanner newCar2 = new Scanner(System.in);
        Scanner choice = new Scanner(System.in); // for Switch Statement 1
        Scanner choice2 = new Scanner(System.in); // for Switch Statement 2

        //BEGIN GETTING VEHICLE INFO FROM USER

        int userinput2;
        do {
            System.out.println("---------------------------------------");
            System.out.println("|          Add a Car                  |");
            System.out.println("---------------------------------------");


            System.out.print("Please enter veh make: ");
            String make = newCar.next();// local variable

            System.out.print("Please enter veh model: ");
            String model = newCar.next();  // local variable

            System.out.print("Please enter veh year: ");
            int year = newCar.nextInt();  //  local variable

            System.out.print("Please enter veh color: ");
            String color = newCar2.next();  // local variable

            System.out.print("Please enter veh Mileage: ");
            int milesOnTheOdometer = newCar.nextInt(); //local variable
            //END GETTING VEHICLE INFO FROM USER


            System.out.println("\n");
            System.out.println("---------------------------------------");
            System.out.println("You've added:");

            //VEHICLE ADDED TO ARRAYLIST
            carList.add(new Car(make, model, year, color, milesOnTheOdometer));
            carList.get(0);


            //CONFIRMATION FROM USER
            System.out.println(carList);
            System.out.println("Is this correct?\n");
            System.out.println("Press 1 and Enter for Yes");
            System.out.println("Press 2 and Enter for No\n");

            choice.next();

            System.out.println("---------------------------------------");
            System.out.println("Would you like to add another vehicle?\n");
            System.out.println("Press 1 for yes.");
            System.out.println("Press 2 for no.\n");

            userinput2 = choice2.nextInt();

        } while (userinput2 == 1);

        //USER CONFIRMS ADDING MORE VEHICLES OR NOT

        /*switch (userinput2) {
            case 1: // yes
                System.out.println("Confirmed.");
                break;
            case 2://no
                break;
            default:
                System.out.println("Invalid");
        }*/
    }
}
