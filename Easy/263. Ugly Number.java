//the int n could only have factor with 2,3 or 5. if not, return false
//e.g. 2*7=14, return false, coz it have factor of 7.
//e.g. 2*5=10, return true. 
public class Solution {
    public boolean isUgly(int n) {
    while (n>=2){
        if (n%2==0) n=n/2;
        else if (n%3==0) n=n/3;
        else if (n%5==0) n=n/5;
        else return false;
        }
        return n==1;   
    }
}
