import java.util.*;
class Main {
  public static void main(String[] args) {
    String name="5.6/0.7*2 – 3.5";
    /*String r = "";
    for(int i= 0; i< name.length(); i++){
      r += Character.toString(name.charAt(i));
      System.out.println(r);
    }*/
    
    StringBuilder sb= new StringBuilder();
    sb.append(name, 0,1);
    System.out.println(sb);
  }
}
