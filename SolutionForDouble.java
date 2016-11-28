import java.util.*;

public class SolutionForDouble
{ 
  public static void main(String[] args){
    SolutionForDouble solution = new SolutionForDouble();
    Scanner input = new Scanner(System.in);
    String s ="";
    while (true){
      System.out.println("Input: ");
      s=input.nextLine();
      if (s.equals("q")){break;}
      System.out.println("Output: ");
      System.out.println(solution.Solution1(s));
    }  
  }
  public double Solution1(String s){
	    Character sign = '+';
	    Stack<Double> stack = new Stack<>();
	    
	    //String s="-1.3 +5.1/3-0.8";
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
	    while (stack.empty()==false){
	      finalResult+= (Double)stack.pop();
	    }
	    double roundOff = Math.round(finalResult * 100.0) / 100.0;
	    return roundOff;
	  }
}
