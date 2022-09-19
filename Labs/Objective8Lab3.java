public class Objective8Lab3{
  public static void main(String[] args){
    int counter = 1;

    /*Write a for loop.
    Declare and initialize your control variable to 1.
    Add a conditional statement to make the loop execute 20 times.
    increment your control variable with each iteration.
    write your for loop body
    Write an if statement that determines if the number is even or odd, think (%) operator.
    Print out counter is even or is odd accordingly.
    Increment the value of counter with each iteration.*/

    for(int i = 1; i <= 20; i++){
      
      if(i % 2 == 0){
        System.out.println(i + " is even");
      }
      else if(i % 2 == 1){
        System.out.println(i + " is odd");
      }
    }
  }
}
