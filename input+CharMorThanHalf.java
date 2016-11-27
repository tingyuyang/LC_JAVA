/*
Given astring,design an algorithm in O(n) running time to find the character thatappears morethan half of the time in the string. If the character does notexist, outputnull.
Input:abadacababaaaa
Output: a
Input:abcdeabbad
Output: null
*/

import java.util.*;

class Main {
  public Character findChar(String s){
    HashMap <Character, Integer> map= new HashMap<>();
    int l= s.length();
    Character returnVal = null;
    for (int i = 0; i <l; i++){
      if(map.get(s.charAt(i))!=null && map.get(s.charAt(i))>l/2){
        return (s.charAt(i));
      } else if (map.get(s.charAt(i))!=null){
        int j =map.get(s.charAt(i))+1;
        map.put(s.charAt(i),j);
      }else{
        map.put(s.charAt(i),1);
      }
    }
    return returnVal;
  }
  public static void main(String[] args) {
    System.out.println("Hi,user, if you want to end, put 'q' after input:");
    Main m = new Main();
    Scanner input=new Scanner(System.in);
    String s ="";
    while (true){
      System.out.println("Input :");
      s=input.nextLine();
      if (s.equals("q")){
        break;
      } 
      Character result = m.findChar(s);
      if (result == null){
        System.out.println("Output:null");
      }else{
        System.out.println("Output:"+result);
      }
    }
    System.out.println("Goodbye, User.");
  }
}

//Solution 1,
import java.util.*;
class Main {
  public Character findChar(String s){
    HashMap <Character, Integer> map= new HashMap<>();
    int l= s.length();
    Character returnVal = null;
    for (int i = 0; i <l; i++){
      if(map.get(s.charAt(i))!=null && map.get(s.charAt(i))>l/2){
        return (s.charAt(i));
      } else if (map.get(s.charAt(i))!=null){
        int j =map.get(s.charAt(i))+1;
        map.put(s.charAt(i),j);
      }else{
        map.put(s.charAt(i),1);
      }
    }
    return returnVal;
  }
  public static void main(String[] args) {
    Main m = new Main();
    String s= "abadacababaaaa";
    //Arrays.toString(array);
    System.out.println(m.findChar(s));
  }
}

//Solution 2
//main menu only, can check what is in the hashmap
import java.util.*;
class Main {
  public static void main(String[] args) {
    HashMap <Character, Integer> map= new HashMap<>();
    String s= "abadacababaaaa";
    int l= s.length();

    for (int i = 0; i <l; i++){
      if(map.get(s.charAt(i))!=null && map.get(s.charAt(i))>l/2){
        System.out.println(s.charAt(i)+">>>"+map.get(s.charAt(i)));   //recall the char, and how many char is in the map.
      } else if (map.get(s.charAt(i))!=null){
        int j =map.get(s.charAt(i))+1;
        map.put(s.charAt(i),j);
      }else{
        map.put(s.charAt(i),1);
      }
    }
    for (Map.Entry<Character,Integer> entry: map.entrySet()){	
        Character key = entry.getKey();
        int value = entry.getValue();
        System.out.println(key + ":"+value);
      }
  }
}
