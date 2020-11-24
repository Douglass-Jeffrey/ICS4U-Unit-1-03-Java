/*
* The EnergyCalc program implements an application that determines the maximum 
* possible amount of potenital energy stored in an objects molecular bonds.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-23 
* Class EnergyCalc.
*/

import java.util.Scanner;

public class EnergyCalc {

  /**
  * The EnergyCalc function implements an application that determines the maximum 
  * possible amount of potenital energy stored in an objects molecular bonds.
  */

  public static void main(String[] args) {

    //Speed of light const
    final double lightSpeedInVaccum = 2.998 * Math.pow(10, 8);
    
    // Create a scanner object
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Mass(kg):");

    // Read double input 
    double mass = myObj.nextFloat();

    //process (calculates energy and amount of kiloton bombs)
    double energy = mass * Math.pow(lightSpeedInVaccum, 2);
    double bombsnum = energy / (4 * Math.pow(10, 12));

    // Output
    System.out.println("Total theoretical energy capacity (J): " + energy); 
    System.out.println("Energy in terms of 'kiloton' bombs (J) : " + bombsnum);
  }
}
