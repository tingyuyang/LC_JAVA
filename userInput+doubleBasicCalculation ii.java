/*
Similar to 227.Basic Calculator II
Input: 5.6 / 0.7 * 2 – 3.5
Output: 12.5

Input: -1.3 + 5.1 / 3 – 0.8
Output: -0.4

Thought reference: 
http://eugeneyang.com/2016/04/21/Basic%20Calculator%20II%20-%20%E5%9F%BA%E6%9C%AC%E8%AE%A1%E7%AE%97%E5%99%A8II/

*/

//Solution , read user input
//String s="-1.3 +5.1/3-0.8";
//String s ="5.6/0.7*2- 3.5";
import java.util.*;
class Main {
  public static void main(String[] args) {
    Main m = new Main();
    Scanner input = new Scanner(System.in);
    String s = "";
    while (true){
      System.out.println("Input: ");
      s=input.nextLine();
      if (s.equals("q")){break;}
      System.out.println("Output: ");
      System.out.println(m.basicCalculator(s));
    }
  }
  public double basicCalculator(String s){
    Character sign = '+';
    Stack stack = new Stack();
    
    s=s.replaceAll("\\s+","");  //remove all the extra space!
    String str ="";
    
    double r = 0;
    double finalResult = 0;
    for (int i =0; i<s.length(); i++){
      if (i==0 || s.charAt(i)>'0' || s.charAt(i)=='.'){ //***the condition is crutial! "i==0"(for "-1.3")
        str+=Character.toString(s.charAt(i));   // not symbol, add into str
      }
      if (s.charAt(i)<'0' && s.charAt(i)!='.' && i!=0 || i==s.length()-1){  //***the condition is crutial!
        r = Double.parseDouble(str);
        if (sign =='+'){stack.push(r);}
        if (sign =='-'){stack.push(-r);}
        if (sign =='*'){stack.push((Double)stack.pop()*r);}   //***Double for stack.pop()
        if (sign =='/'){stack.push((Double)stack.pop()/r);}
        sign =s.charAt(i);
        r=0;
        str="";
      }
    }
    while (stack.empty()==false){
      finalResult+= (Double)stack.pop();
    }
    return finalResult;
  }
}


// in Main menu
import java.util.*;
class Main {
  public static void main(String[] args) {
    Character sign = '+';
    Stack stack = new Stack();
    
    String s="-1.3 +5.1/3-0.8";
    //String s ="5.6/0.7*2- 3.5";
    s=s.replaceAll("\\s+","");  //remove all the extra space!
    String str ="";
    
    double r = 0;
    double finalResult = 0;
    for (int i =0; i<s.length(); i++){
      if (i==0 || s.charAt(i)>'0' || s.charAt(i)=='.'){ //***the condition is crutial! "i==0"(for "-1.3")
        str+=Character.toString(s.charAt(i));   // not symbol, add into str
      }
      if (s.charAt(i)<'0' && s.charAt(i)!='.' && i!=0 || i==s.length()-1){  //***the condition is crutial!
        r = Double.parseDouble(str);
        if (sign =='+'){stack.push(r);}
        if (sign =='-'){stack.push(-r);}
        if (sign =='*'){stack.push((Double)stack.pop()*r);}   //***Double for stack.pop()
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
    // if i wang to have round off 1 decimal point:
    double roundOff = Math.round(finalResult * 100.0) / 100.0;
    System.out.println(roundOff);
  }
}
