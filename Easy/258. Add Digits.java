public class Solution {
    public int addDigits(int num) {
        String[] numStr=Integer.toString(num).split("");
        int len =numStr.length;
        int result=0;
        while (len!=1){
        	result=0;
        	for (int i=0;i<len;i++){
        		result+=Integer.parseInt(numStr[i]);
        	}
        	numStr=Integer.toString(result).split("");
    		len=numStr.length;
        }
        System.out.println(result);
        return result;
    }
}
