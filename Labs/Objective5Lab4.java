import java.util.Scanner;

public class Objective5Lab4{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int userNum;

    System.out.println("Enter any number: ");
    userNum = userInput.nextInt();

    if(userNum % 2 == 0){
      System.out.println("The number is even.");
    }
    else if(userNum % 2 == 1){
      System.out.println("The number is odd");
    }

  }
}
