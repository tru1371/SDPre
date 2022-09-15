import java.util.Scanner;

public class Objective5Lab3{
  public static void main(String[] ags){
    Scanner userInput = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = userInput.nextInt();

    if(userNum >= 0){
      System.out.println("The number is postive.");
    }
    else if(userNum <= -1){
      System.out.println("The number is negative.");
    }

    userInput.close();
  }
}
