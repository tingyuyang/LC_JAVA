//Basic Note
// symbol with "*" are the important line for the code.
/*
javac Main.java
java Main
*/

//Main 1
import java.util.Arrays;// *this line is the point! to print whole list
public class Main {
	public static void main(String[] args) {
    	System.out.println("hello world");
    	int[] intArray = { 7, 9, 5, 1, 3 };
 	System.out.println(Arrays.toString(intArray)); //*point
	}
}


//Main 2
import java.util.Arrays;	//*
class Main {
  public String reverseString(String s){
  	if (s==null || s.length()==0){
  		return "";
  	}
  	String[] array=s.split("");
  	System.out.println(Arrays.toString(array));	//*
  	return ("a");
  } 
  public static void main(String[] args) {
    String s ="hello";
    Main m=new Main();	//*
    m.reverseString(s);	//*
    System.out.println("hello world");
  }
//[h, e, l, l, o]
//hello world  
}

//string .equals
public class Main {
	public static void main(String[] args) {
		String str = "aba";
		String stored ="";
		stored += "ab";
		if (stored.equals("ab")){ //can't do "stored == "ab"" here
			System.out.println("True");
		}
		System.out.println(stored + " "+ str);
	}
}








