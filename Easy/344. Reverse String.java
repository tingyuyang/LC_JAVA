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
