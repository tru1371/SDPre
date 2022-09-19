import java.util.Scanner;

public class Objective9Lab4{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    double num1, num2, average;

    System.out.println("Please give me a number: ");
      num1 = userInput.nextDouble();
    System.out.println("Please give me another number: ");
      num2 = userInput.nextDouble();

    average = findAverage(num1, num2);

    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

    userInput.close();
  }

  public static Double findAverage(double x, double y){
    double sum;

    sum = (x + y)/ 2;

    return sum;
  }
}
