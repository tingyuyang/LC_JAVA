/*
same thought in python:
This is such a weird question.
if input is[0,1], you need to return 2.....BUT WHY?
the question did not ask on POINT, ****like WHAT EXACTLY ARE U ASKING HERE?!****   
so simple math used here (首项 + 末项) * 项数 / 2
NOTICE:the input might not be in order
*/
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i <nums.length; i++){
            sum+=nums[i];
        }
        int expect = (1+nums.length)*nums.length/2;
        return ( expect-sum); // pay attention. "expect -num" instead of another way around.
    }
}
