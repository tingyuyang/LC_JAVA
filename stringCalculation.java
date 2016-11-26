import java.util.*;
class Main {//remember to figure out get rid of spaces
  public static void main(String[] args) {
    String name="1.3+5.1/3–0.8";//"figure out -1.3 later!
    String r = "";
    double foo = 0; //attention to double here!
    for(int i= 0; i< name.length(); i++){
      if(name.charAt(i)!='/' && name.charAt(i)!='*' && name.charAt(i)!='+' && name.charAt(i)!='–'){
        r += Character.toString(name.charAt(i));
      } 
      if(name.charAt(i)=='/' || name.charAt(i)=='*' || name.charAt(i)=='+' || name.charAt(i)=='–' || i==name.length()-1){
        foo = Double.parseDouble(r);
        r="";
      }
      System.out.println(foo);     
    }
  }
}
