public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < numbers.length;i++){
            if (map.containsKey(numbers[i])){
                int[] result = {map.get(numbers[i])+1,i+1};
                return result;
            }
            int left = target-numbers[i];
            map.put(left, i);
        }
        int[] result = {};
        return result;
    }
}
