public class Objective5Lab2{
  public static void main(String[] args){
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    // Line 7 through line 13 compares string 1 and string 2
    if(string1.equals(string2)){
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else{
      System.out.println(string1 + " is not equivalent to " + string2);
    }
    // Line 14 through line 19 will compare string 1 and string 3
    if(string1.equals(string3)){
      System.out.println(string1 + " is equivalent to " + string3);
    }

  }
}
