/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
//similar python Solution 1
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0; i < nums.length;i++){
          if (map.containsKey(nums[i])){   //*map.contains(X)
            int[] result= {map.get(nums[i]), i };   //*map.get(X)
            return result;
          }
          int rest = target-nums[i];
          map.put(rest,i);
        }
        int[] result ={};
        return result;
  }
}

//Or Solution 2
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0; i < nums.length;i++){
          int rest = target-nums[i];
          if (map.get(nums[i]) != null) {   //*****only difference
                    int[] result = {map.get(nums[i]) , i };    
                    return result;
          }
          map.put(target - nums[i], i);
        }
    int[] result ={};
    return result;
  }
}


// whole code+test+main menu+print while hashmap
//Solution 1 
import java.util.*;

class Main {
  public int[] twoSum(int[]nums,int target){
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i=0; i < nums.length;i++){
      if (map.containsKey(nums[i])){ 
        int[] result= {map.get(nums[i]), i };
        return result;
      }
      int rest = target-nums[i];
      map.put(rest,i);
    }
    
    for (Map.Entry<Integer,Integer> entry: map.entrySet()){
        Integer key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println(key + ":"+value);
    }
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
