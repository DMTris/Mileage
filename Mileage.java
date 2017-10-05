/*
Project  :  A04c - Mileage
File     :  Mileage.java
Name     :  Chris Langdale
Date     :  05/10/2017 (05/10/2017)

Description :  Calculate and display the miles per gallon obtained for each tankful and print the average miles per gallon obtained for all tankfuls.

*/

//imports
import java.util.Scanner;

//start of class
public class Mileage
{
   //start of main
   public static void main (String[] args)
   {
      //variable declarations
      Scanner input = new Scanner(System.in);
      int milesDriven = -1;
      int gallonsUsed = 0;
      int totalMilesDriven =0;
      int totalGallonsUsed = 0;
      int tankOfGas = 0;
      double milesPerGallon = 0;
      double totalMilesPerGallon = 0;
      
      //while loop milesDriven != 0
      while (milesDriven !=0)
      {
         System.out.printf("%nEnter miles driven (integer), or 0 (Zero) to exit: ");
         milesDriven = input.nextInt();
         
         //if milesDriven != 0 perform MPG calculations
         if (milesDriven != 0)
         {
            System.out.printf("%nEnter gallons used (integer): ");
            gallonsUsed = input.nextInt();
            
            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;
            milesPerGallon = (double) milesDriven / gallonsUsed;
            totalMilesPerGallon = (double) totalMilesDriven / totalGallonsUsed;
            
            tankOfGas++;
            
            System.out.printf("%nThe MPG for tank %d is %.1f.", tankOfGas, milesPerGallon);
            System.out.printf("%nThe average MPG for all tankfuls is %.1f.%n", totalMilesPerGallon);
         }
      }
      
   }//end of main
   
}//end of class