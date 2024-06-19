import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";

        double recWidth = 0;
        double recHeight = 0;
        double recArea = 0;
        double recPeri = 0;
        double recDiag = 0;

        boolean done = false;
        do{
            System.out.print("Enter the width of the rectangle in inches: ");
            if(in.hasNextDouble()){
                recWidth = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a val" +
                        "id width in inches, not " + trash + ".");
            }
        }while (!done);
        System.out.println("You answered " + recWidth + " inches.");

        done = false;
        do{
            System.out.print("\nEnter the height of the rectangle in inches: ");
            if(in.hasNextDouble()){
                recHeight = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a val" +
                        "id height in inches, not " + trash + ".");
            }
        }while (!done);
        System.out.println("You answered " + recHeight + " inches.");

        recArea = recWidth * recHeight;
        recPeri = (recWidth * 2) + (recHeight * 2);
        recDiag = java.lang.Math.sqrt(Math.pow(recWidth, 2) + Math.pow(recHeight, 2));
        System.out.println("\nYour rectangle has an area of " + recArea + " square inches and" +
                " a perimeter of " + recPeri + " inches." +
                "\nThe diagonal of your rectangle is " + recDiag + " inches.");
    }
}