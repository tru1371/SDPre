import java.util.Scanner;

public class Objective4Lab1{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("What is your first name: ");
    String firstName = userInput.nextLine();
    System.out.println("What is your last name: ");
    String lastName = userInput.nextLine();
    System.out.println("What is your favorite animal: ");
    String favAnimal = userInput.nextLine();
    System.out.println("What is your favorite food: ");
    String favFood = userInput.nextLine();
    System.out.println("What is your favorite song: ");
    String favSong = userInput.nextLine();

    System.out.println("\nMy name is " + firstName + " " + lastName + ". \n" +
                      "My favorite animal is the " + favAnimal + ". \n" +
                      "My favorite food is " + favFood + ". \n" +
                      "My favorite song is " + favSong + ".");
  }
}
