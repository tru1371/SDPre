public class Objective3Lab2{
  public static void main(String[] args){
    /*Create a file called Objective3Lab2.java in the SDPre/Labs directory.
    Write a program that calculates the length of the hypotenuse of a right triangle.
    Create a class structure with the name Objective3Lab2.
    Create a main method.
    Create 3 double variables side1, side2, and hypotenuse.
    side1 will hold its respective side length.
    side2 will hold its respective side length.
    hypotenuse should be assigned the calculated hypotenuse length. Remember a2 + b2 = c2.
    Print out the hypotenuse. */

    double side1 = 2; // Declared and initialized side 1
    double side2 = 6; // Declared and initialized side 2
    double hypotenuse; // Declared hypotenuse

    double side1Sqd = Math.pow(side1,2); // Squared side 1
    double side2Sqd = Math.pow(side2,2); // Squared side 2
    double side3Sqd = side1Sqd + side2Sqd; // Added the result of squred side 1 and 2 to get the sum of side 3
    hypotenuse = Math.sqrt(side3Sqd); // Hypotenuse result from square root of side 3

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);

  }
}
