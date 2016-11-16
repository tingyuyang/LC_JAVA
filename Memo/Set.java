import java.util.*;
class Main {
  public static void main(String args[]) { 
      int count[] = {34, 22,10,60,30,22}; //attention, the 22 is duplicate
      Set<Integer> set = new HashSet<Integer>();
      for(int i = 0; i < 5; i++) {
        set.add(count[i]);
      }
      System.out.println(set); //print:[34, 22, 10, 60, 30]
   }
}
