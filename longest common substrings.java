/*
Given an array of strings, write a function to find the longest common substrings.

Sample Input: sungard, gardensun, sunglass

Output: sun

Sample Input: banana, bandina, badnan

Output: ba, na

List<String> lcs(List<String> list) {
}

*/
List<String> lcs(List<String> list){
      List<String> storedList= new LinkedList<String>();
      String result="";
      String storedStr ="";        
      String tempStr="";
      
      for (String s :list) {
          if(storedStr.length()< s.length()){
              storedStr=s;
          }
      }
      
      char [] charsForStr=storedStr.toCharArray();               
      for (char c: charsForStr){
          tempStr+= Character.toString(c);
          for (String s :list){
              if(!s.contains(tempStr)){
                  tempStr=Character.toString(c);
                  for (String a :list){
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
      storedList.add(result);
      return storedList;
  }
