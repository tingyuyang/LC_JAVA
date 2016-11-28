import java.util.*;

class HalfString {
  public Character Solution(String s){
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
    HalfString hf = new HalfString();
    Scanner input=new Scanner(System.in);
    String s ="";
    while (true){
      System.out.println("Input :");
      s=input.nextLine();
      if (s.equals("q")){
        break;
      } 
      Character result = hf.Solution(s);
      if (result == null){
        System.out.println("Output:null");
      }else{
        System.out.println("Output:"+result);
      }
    }
    System.out.println("Goodbye, User.");
  }
}

