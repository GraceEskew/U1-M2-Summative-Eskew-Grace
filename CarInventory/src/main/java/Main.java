import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


/*NOTES:
 * 1. Got system to repeat, but its not holding onto the data. Its printing whole veh info
 *    in one entry like it was a single element in an array
 * - attempting override toString to convert to object (if I'm understanding it correctly).
 * 2. Need array set up, or I can't go any further.
 * 3. Also need to review conditional loops.
 * 4. If time gets away from you, Get RPG done (leave abt 2 days to get it finished) & come back.
 * */

public class Main {

    public static void main(String[] args) {

        // trying a new form to repeat the loop. Trying.

            String input;
            int choice4 = 0;

            //Empty ArrayList
            ArrayList<Car> carList = new ArrayList<>();

            //Creates instance for Menuchar quit = 'n';


            Menu menu = new Menu();

            //User inputs
            Scanner scan = new Scanner(System.in); // OVERALL DECISION TO KEEP GOING
            Scanner choice = new Scanner(System.in); // for Switch Statement 1
            Scanner choice2 = new Scanner(System.in); // for Switch Statement 2
            Scanner choice3 = new Scanner(System.in); // for Switch Statement 3



            //Menu Print
            while (quit != 'y') {
                System.out.println("---------------------------------------");
                System.out.println("|        Welcome to CarShoppe         |");
                System.out.println("|                                     |");
                System.out.println("---------------------------------------");

                System.out.println("Press 1 & Enter to add a vehicle to the inventory.");
                System.out.println("Press 2 & Enter to delete a vehicle from the inventory.");
                System.out.println("Press 3 & Enter to view current inventory.");
                System.out.println("Press 4 & Enter to search the current inventory.");
                System.out.println("Press 5 & Enter to exit CarShoppe.");
                System.out.print("Please make a selection:");

                //User's 1st Selection

                int userinput = choice.nextInt();





                if (userinput == 1) {
                    menu.addVeh();
                } else if (userinput == 2) {
                    System.out.println(carList);
                    System.out.println("Please select the vehicle you wish to remove."); //delete a vehicle
                    //  carList.remove(); with User input



                } else if (userinput == 3) {
                    System.out.println("Welcome to the Inventory"); // View Vehicle
                    Arrays.toString(carList.toArray()); // trying to print array list
                   // ArrayList(Collection<carList>); // see JavaDoc once we get to this point


                    //prompt to exit case
                } else if (userinput == 4) {

                    System.out.println("Welcome to the Search Option");
                    // carList.contains (?)


                } else if (userinput == 5) {
                    System.out.println("Thank you for using CarShoppe and not our competitors."); //exit

                } else if (userinput  == 0 || userinput > 5) {
                    System.out.println("Invalid entry");
                }


            }
        }
    }
