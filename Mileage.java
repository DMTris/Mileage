/*
Project  :  A04c - Mileage
File     :  Mileage.java
Name     :  Chris Langdale
Date     :  05/10/2017 (05/10/2017)

Description :  Calculate and display the miles per gallon obtained for each tankful and print the average miles per gallon obtained for all tankfuls.

**Assuming no calculations should be performed for negative numbers**

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
      int totalMilesDriven =0;
      int totalGallonsUsed = 0;
      int tankOfGas = 0;
      double milesPerGallon = 0;
      double totalMilesPerGallon = 0;
      
      //prompt user for milesDriven input and initialize
      System.out.printf("%nEnter miles driven (integer), or 0 (Zero) to exit: ");
      int milesDriven = input.nextInt();
      
      //while loop milesDriven != 0
      while (milesDriven !=0)
      {
         //if milesDriven != 0 prompt user for gallonsUsed and initialize
         if (milesDriven > 0)
         {
            System.out.printf("%nEnter gallons used (integer): ");
            int gallonsUsed = input.nextInt();
            
            //if gallons used is positive perform MPG calculations
            if (gallonsUsed > 0)
            {
               totalMilesDriven += milesDriven;
               totalGallonsUsed += gallonsUsed;
               milesPerGallon = (double) milesDriven / gallonsUsed;
               totalMilesPerGallon = (double) totalMilesDriven / totalGallonsUsed;
            
               tankOfGas++;
               
               //display results
               System.out.printf("%nThe MPG for tank %d is %.1f.", tankOfGas, milesPerGallon);
               System.out.printf("%nThe average MPG for all tankfuls is %.1f.%n", totalMilesPerGallon);
               
               //prompt for miles or exit
               System.out.printf("%nEnter miles driven (integer), or 0 (Zero) to exit: ");
               milesDriven = input.nextInt();
            }
            //not positive prompt user again
            else
            {
               System.out.printf("%nCannot calculate less than zero, try again.%n");
               System.out.printf("%nEnter gallons used (integer): ");
               gallonsUsed = input.nextInt();
            }

         }
         //not positive prompt user again
         else
         {
            System.out.printf("%nCannot calculate less than zero, try again.%n");
            System.out.printf("%nEnter miles driven (integer), or 0 (Zero) to exit: ");
            milesDriven = input.nextInt();
         }
      }//end of while loop
      
   }//end of main
   
}//end of class