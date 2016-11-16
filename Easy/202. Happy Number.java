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
