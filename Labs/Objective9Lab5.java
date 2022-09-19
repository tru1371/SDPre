import java.util.Scanner;

public class Objective9Lab5{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    double num1, num2, sum, average, tax;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.println("Enter a number: ");
    num1 = userInput.nextDouble();

    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.println("Enter a second number: ");
    num2 = userInput.nextDouble();

    while(keepGoing){
      printMenu();
      System.out.println("Which would you like to do? ");
      choice = userInput.nextInt();

      switch(choice){
        // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      case 1:
      sum = findSum(num1, num2);
      System.out.println(num1 + " + " + num2 + " = " + sum);
      break;
      case 2:
      average = findAverage(num1, num2);
      System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
      break;
      case 3:
      tax = calculateTax(num1, num2);
      System.out.println("The amount of tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + tax);
      break;
      case 4:
      System.out.println("You've chosen to quit.");
      userInput.close();
      break;
      default:
      System.out.println("Invalid entry. Please try again.");
      break;
      }
    }
  }
  public static void printMenu(){
    System.out.println();
  System.out.println("========= MENU =========");
  System.out.println("|                      |");
  System.out.println("|   1. Add Numbers     |");
  System.out.println("|   2. Find Average    |");
  System.out.println("|   3. Calculate Tax   |");
  System.out.println("|   4. Exit            |");
  System.out.println("|                      |");
  System.out.println("========================");
  System.out.println();
  }

  public static double findSum(double x, double y){
    double sum = x + y;
    return sum;
  }
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  public static double findAverage(double x, double y){
    double sumAverage = (x + y)/ 2;
    return sumAverage;
  }

	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  public static double calculateTax(double x, double y){
    double calcTax = (x + y) * 0.0831;
    return calcTax;
  }

}
