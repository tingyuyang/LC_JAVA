/*
reference:
http://www.cnblogs.com/grandyang/p/4447233.html ***
http://www.cnblogs.com/grandyang/p/5560036.html
*/
//i used set here
//clean version:
import java.util.*;//**
class Main {
	public boolean isHappy(int n) {
        if (n==1){
            return true;
        }
     	Set<Integer> set = new HashSet<Integer>();
    	while (n!=1){ 
            int result=0;
            while (n!=0){
                    result+=(n%10)*(n%10);
                    n=n/10;
        	}
        	if (set.contains(result)) break;//**
        	set.add(result);
        	n=result;
        	System.out.println(set);
    	}
    	
    	return set.contains(1);//**
    }
    
	public static void main(String[] args) {
		Main m=new Main();
		System.out.println(m.isHappy(19));
  }
}

//first solution
public class Solution {
    public boolean isHappy(int n) {
        if (n==1){
            return true;
        }
        int result=n;
        int reminder=0;
        Set<Integer> set = new HashSet<Integer>();
        while (result!=1){ 
              n=result;
              result=0;
              while (n!=0){
                      reminder=n%10;
                      n=n/10;
                      result+=reminder*reminder;
            }
            if (result==1){
              return true;
            }else if (set.contains(result)){
              return false;
            }
            set.add(result);
        }
    	return false;
    }
}

