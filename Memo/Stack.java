import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception{
    Stack st = new Stack();
   // populating stack
   st.push("+");
   st.push("-");
   st.push("*");
   
   // removing top object
   System.out.println("Removed object is: "+st.pop());
      
   // elements after remove
   System.out.println("Elements after remove: "+st);
    } 
}
/*
Removed object is: *
Elements after remove: [+, -]
*/
