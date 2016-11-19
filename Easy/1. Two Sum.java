public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0; i < nums.length;i++){
          int rest = target-nums[i];
          if (map.get(nums[i]) != null) {
                    int[] result = {map.get(nums[i]) , i };
                    return result;
          }
          map.put(target - nums[i], i);
        }
    int[] result ={};
    return result;
  }
}



// i dont know why my solution is not working
/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
import java.util.*;

class Main {
  public int[] twoSum(int[]nums,int target){
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i=0; i < nums.length;i++){
      int rest = target-nums[i];
      System.out.println(">>"+rest);
      
      if (map.containsKey(rest)){
        System.out.println("COOOL");
        int[] result= {map.get(rest), i };
        return result;
      }
      map.put(rest,i);
    }
    //if (map.containsKey(7)){
      //  System.out.println(map.get(7));}
    
    /*
    for (Map.Entry<Integer,Integer> entry: map.entrySet()){
        Integer key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println(key + ":"+value);
    }*/
    int[] result ={};
    return result;
  }
  public static void main(String[] args) {
    // Create a hash map
      int[] nums = new int[]{2, 7, 11, 15};
      int target= 9;
      Main m = new Main();
      int[] result = m.twoSum(nums,target);
      System.out.println(Arrays.toString(result));
      
  }
}
