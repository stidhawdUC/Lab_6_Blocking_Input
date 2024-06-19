import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcTemp = 0;
        double fahrTemp = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print("Enter a temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                celcTemp = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou must enter a val" +
                        "id temperature in Celsius, not " + trash + ".");
            }
        }while (!done);
        fahrTemp = celcTemp * 1.8 + 32;
        System.out.println("You entered your temperature in Celsius as " + celcTemp + "." +
                "\nYour temperature in Fahrenheit is " + fahrTemp + ".");


    }
}