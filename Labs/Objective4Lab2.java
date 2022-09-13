import java.util.Scanner;

public class Objective4Lab2{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    int whole1, whole2, whole3, sumWhole;
    double dbl1, dbl2, dbl3, sumDbl;

    System.out.println("Enter a first whole number: ");
    whole1 = userInput.nextInt();
    System.out.println("Enter a second whole number: ");
    whole2 = userInput.nextInt();
    System.out.println("Enter a third whole number: ");
    whole3 = userInput.nextInt();

    System.out.println("Enter a first decimal number: ");
    dbl1 = userInput.nextDouble();
    System.out.println("Enter a second decimal number: ");
    dbl2 = userInput.nextDouble();
    System.out.println("Enter a third decimal number: ");
    dbl3 = userInput.nextDouble();

    sumWhole = whole1 + whole2 + whole3;
    sumDbl = dbl1 + dbl2 + dbl3;

    System.out.println("The sum of " + whole1 + " + " + whole2 + " + " + whole3 + " = " + sumWhole);
    System.out.println("The sum of " + dbl1 + " + " + dbl2 + " + " + dbl3 + " = " + sumDbl);
  }
}
