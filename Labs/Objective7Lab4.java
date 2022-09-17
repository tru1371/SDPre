public class Objective7Lab4{
  public static void main(String[] args){
/*Create a file called Objective7Lab4.java in the SDPre/Labs directory.
Write a program that sums up the numbers 1 -> 20 1 + 2 + 3 ... + 20 using a while loop.
Create a class structure with the name Objective7Lab4.
Create a main method.
Create two variables to store the current sum total and a counter.
Write a while loop.
Use the count variable to have the loop execute 20 times.
Increment the value of count with each iteration.
Update the current sum by adding count to sum with each iteration.*/
int counter = 0;
int sum = 0;

do{

counter = counter + 1;
sum = sum + counter;

}
while(counter <= 20);

System.out.println(sum);

  }
}
