import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double gasGallons = 0;
        double milesPerGallon = 0;
        double dollarsPerGallon = 0;
        boolean done = false;

        double milePrice = 0;
        double costPerHundred = 0;
        double howFarMoanaCar = 0;

        do{
            System.out.print("Enter the number of gallons of gas: ");
            if(in.hasNextDouble()){
                gasGallons = in.nextDouble();
                    in.nextLine();
                    done = true;
                }
                else {
                    trash = in.nextLine();
                    System.out.println("You must enter a val" +
                            "id amount of gas in gallons, not " + trash + ".");
                }
        }while (!done);
        System.out.println("You answered " + gasGallons + " gallons.");

        done = false;
        do{
            System.out.print("\nEnter your fuel efficiency (in miles per 1 gallon): ");
            if(in.hasNextDouble()){
                milesPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a val" +
                        "id fuel efficiency in miles per 1 gallon, not " + trash + ".");
            }
        }while (!done);
        System.out.println("You answered " + milesPerGallon + " miles per gallon.");

        done = false;
        do{
            System.out.print("\nEnter the price of gas (in dollars for one gallon): ");
            if(in.hasNextDouble()){
                dollarsPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a val" +
                        "id gas price in dollars for one gallon, not " + trash + ".");
            }
        }while (!done);
        System.out.println("You answered " + dollarsPerGallon + " dollars per gallon.");

        milePrice = dollarsPerGallon / milesPerGallon;
        costPerHundred = milePrice * 100;
        String milePriceDisplay = String.format("%4.2f", milePrice);
        String costPerHundredDisplay = String.format("%4.2f", costPerHundred);
        System.out.println("\nIt would cost you " + costPerHundredDisplay + " dollars to drive 100 miles," +
                " at a rate of " + milePriceDisplay + " dollars per mile.");

        howFarMoanaCar = gasGallons * milesPerGallon;
        String moanaCarDisplay = String.format("%4.3f", howFarMoanaCar);
        System.out.println("\n" + gasGallons + " gallons of gas in the tank would get you " + moanaCarDisplay + " miles.");


    }
}