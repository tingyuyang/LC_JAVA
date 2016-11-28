import java.util.*;
class Main {
  public static void main(String[] args) {
     Main m = new Main();
      String a = "abcd";
      String b = "abc";
      String c ="a";
      String [] strArr = new String[]{"banana", "bandina", "badnan"};
      
      System.out.println(m.lcs(strArr));  
    
  }
  List<String> lcs(String [] stringArray){
      List<String> list= new LinkedList<String>();
      String result="";
      String storedStr ="";        
      String tempStr="";
      
      for (String s :stringArray) {
          if(storedStr.length()< s.length()){
              storedStr=s;
          }
      }
      
      char [] charsForStr=storedStr.toCharArray();               
      for (char c: charsForStr){
          tempStr+= Character.toString(c);
          for (String s :stringArray){
              if(!s.contains(tempStr)){
                  tempStr=Character.toString(c);
                  for (String a :stringArray){
                      if(!a.contains(tempStr)){
                          tempStr="";
                          break;
                      }
                  }
                  break;
              }               
          }
  
          if(tempStr!="" && tempStr.length()>result.length()){
              result=tempStr;  
          }                       
      }   
      list.add(result);
      return list;
  }
}
