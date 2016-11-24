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

class Main {
  public static void main(String[] args) {
    System.out.println("if you want to quit, input 'q'");
    Scanner input=new Scanner(System.in);
    String s ="";       //*** pay attention to the doube quote ""
    while (true){
      System.out.println("Do you want to quit? :");
      s=input.nextLine();
      if (s.equals("q")){   //***"q" double quote. not single quote.
        System.out.println("Ok, you want to quit");
        break;
      } else{
        System.out.println("Ok,let's continue.");
      }
    }
    System.out.println("Goodbye");
  }
}
