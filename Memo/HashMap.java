// How to iterate through hashmap
import java.util.*;

class Main {
  public static void main(String[] args) {
    // Create a hash map
      HashMap hm = new HashMap();
      
      // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));
      
      
      Iterator iterator = hm.keySet().iterator();
      
      while (iterator.hasNext()) {
		   String key = iterator.next().toString();
		   String value = hm.get(key).toString();
		  
		   System.out.println(key + " " + value);
      }
  }
}
