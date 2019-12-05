package se.lexicon.skovde;

import se.lexicon.skovde.models.Car;
import se.lexicon.skovde.models.OutOfFuelException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static Scanner scan = new Scanner(System.in);

    public static void main( String[] args ) {
        Car aCar = new Car();
        aCar.setBrand("Volvo");
        aCar.setModelName("740");
        aCar.refuel(100);

        for (int i = 0; i < 5; i++) {
            try {
                aCar.consumeFuel(askUserFor("Fuel"));//Checked must have Try or Throws
            } catch (OutOfFuelException e) {
                //System.out.println("Can´t consume so much fuel! need to refuel: " + e.getFuelReq());
                e.printStackTrace();
            }
        }
    }

    static int askUserFor(String x)
    {
        boolean incorrectNumber = true;
        int number = 0;
        while (incorrectNumber)
        {
            System.out.print("Input " + x + ": ");

            try {
                number = scan.nextInt();//Unchecked
                incorrectNumber = false;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                scan.nextLine();
            }
            finally {
                scan = new Scanner(System.in);// clear buffert in scanner every time
            }
        }
        return number;
    }
}
