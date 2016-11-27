/*
Similar to 227.Basic Calculator II
Input: 5.6 / 0.7 * 2 – 3.5
Output: 12.5

Input: -1.3 + 5.1 / 3 – 0.8
Output: -0.4
*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    Character sign = '+';
    Stack stack = new Stack();
    
    String s="-1.3 +5.1/3-0.8";
    s=s.replaceAll("\\s+","");  //remove all the extra space!
    String str ="";
    
    double r = 0;
    double finalResult = 0;
    for (int i =0; i<s.length(); i++){
      if (i==0 || s.charAt(i)>'0' || s.charAt(i)=='.'){
        str+=Character.toString(s.charAt(i));   // not symbol, add into str
      }
      if (s.charAt(i)<'0' && s.charAt(i)!='.' && i!=0 || i==s.length()-1){
        r = Double.parseDouble(str);
        if (sign =='+'){stack.push(r);}
        if (sign =='-'){stack.push(-r);}
        if (sign =='*'){stack.push((Double)stack.pop()*r);}
        if (sign =='/'){stack.push((Double)stack.pop()/r);}
        sign =s.charAt(i);
        r=0;
        str="";
      }
    }
    System.out.println(stack);
    while (stack.empty()==false){
      finalResult+= (Double)stack.pop();
    }
    System.out.println(finalResult);
  }
}
