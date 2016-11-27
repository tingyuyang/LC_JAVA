//the easiest input
import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("if you want to quit, input 'q'");
    Scanner input=new Scanner(System.in);
    System.out.println("input:");
    String s ="";
    System.out.println("Your input is: "+input.nextLine());
  }
}

//while loop with user input
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String s = "";    //*** pay attention to the doube quote ""
    while (true){
      System.out.println("Please enter your input:");
      s = input.nextLine();
      if (s.equals("q")){     //***"q" double quote. not single quote.
        System.out.println("Bye, You would like to quit.");
        break;
      }
      System.out.println("Ok, lets continue");
    }
  }
}
