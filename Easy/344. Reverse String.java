/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/
//relate solution: http://blog.csdn.net/crazy1235/article/details/51420522

//Solution 1:
//can just be one line
return new StringBuffer(s).reverse().toString();

//Solution 2: 
//TIME EXCEED :(!!!!
import java.util.Arrays;
class Main {
  public String reverseString(String s){
  	String[] array=s.split("");
  	String sb = "";
  	int l=array.length-1;
  	while(l>=0){
  		sb +=array[l];
  		--l;
  	}
  	return (sb);
  }
  
  public static void main(String[] args) {
    String s ="hello";
    Main m=new Main();
    m.reverseString(s);
    System.out.println(m.reverseString(s));
  }
  
}


