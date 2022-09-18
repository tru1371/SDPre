import java.util.Scanner;

public class Objective7Lab5{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int selection;

    while(true){
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My Favorite Foods");
      System.out.println("3: Exit \n");

      selection = userInput.nextInt();

      // My solution using a switch statement
      switch(selection){
        case 1:
          System.out.println("Hello Human\n");
          break;
        case 2:
          System.out.println("Apples, Bananas, Coconuts\n");
          break;
        case 3:
            userInput.close();
           System.out.println("Goodbye\n");
           break;
      }

      // My solution using an if else statement
      // if(selection == 1){
      //   System.out.println("Hello Human");
      //   //break;
      // }
      // else if(selection == 2){
      //   System.out.println("Apples, Bananas, Coconuts");
      //   //break;
      // }
      // else{
      //   System.out.println("Goodbye");
      //   userInput.close();
      // }
    }
  }
}
