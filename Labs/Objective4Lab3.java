import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    int age, birthYear;
    int currentYear = 2022; 

    System.out.println("How old are you? ");
    age = userInput.nextInt();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    userInput.close();

  }
}
