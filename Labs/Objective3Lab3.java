public class Objective3Lab3{
  public static void main(String[] args){
    /*Objective: Simulate a rolled die to get 3 random values between 1 and 6.
    Create a file called Objective3Lab3.java in the SDPre/Labs directory.
    Create a class structure with the name Objective3Lab3.
    Create a main method.
    Create 3 int variables first, second, and third.
    These three variables will each be a randomly selected number between 1 and 6 */

    int first, second, third, sum;

    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);

    sum = first + second + third;

    System.out.println(first + " + " + second + " + " + third + " = " + sum);
  }
}
