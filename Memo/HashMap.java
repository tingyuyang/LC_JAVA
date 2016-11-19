import java.util.*;
class Main {
  public static void main(String[] args) {
    // Create a hash map
      HashMap<Integer,String> map=new HashMap<>();// Integer would be the key, String would be value
      map.put(1, "One");
      map.put(2, "Two");
      System.out.println(map.get(1));//map.get is for the KEY
      
      for (Map.Entry<Integer,String> entry: map.entrySet()){	//"<Integer,String>" is important!
        int key = entry.getKey();
        String value = entry.getValue();
        System.out.println(key + ":"+value);
      }
  }
}

//Another map example
import java.util.*;

class Main {
  public static void main(String[] args) {
      HashMap<String, Double> hm = new HashMap<>();
      hm.put("Zara", 3434.34);
      hm.put("Mahnaz",123.22);
      for (Map.Entry<String, Double> entry : hm.entrySet()){
        String key = entry.getKey();
        Double value = entry.getValue();
        System.out.println(key+":"+value);
      }
  }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////


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


//from tutorial point
import java.util.*;

class Main {
  public static void main(String[] args) {
    // Create a hash map
      HashMap hm = new HashMap();
      
      // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));

      // Get a set of the entries
      Set set = hm.entrySet();
      
      // Get an iterator
      Iterator i = set.iterator();
      
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      
      // Deposit 1000 into Zara's account
      double balance = ((Double)hm.get("Zara")).doubleValue();
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + hm.get("Zara"));
  }
}
