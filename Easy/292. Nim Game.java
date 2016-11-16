import java.util.Arrays;
// my solution is partially guessing. if the stone number is 4, 8, 12.... i will not win for sure.

class Main {
  public boolean nimGame(int n){
  	boolean result=false;
  	if (n<4){
  		result= true;
  	} else if (n%4!=0){
  		result= true;
  	}
  	return result;
  }
  
  public static void main(String[] args) {
    String s ="hello";
    Main m=new Main();
    System.out.println(m.nimGame(4));
  }
  
}
