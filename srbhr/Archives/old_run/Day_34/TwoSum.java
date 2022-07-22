import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap <Integer, Integer> elementMap = new HashMap<>();
        int len = nums.length;

        for (int i=0;i<len;i++){
            Integer complement = (Integer) target-nums[i];
            if (elementMap.containsKey(complement)){
                return new int[]{elementMap.get(complement),i};
            }
            elementMap.put(nums[i],i);
        }
    return  null;
    }
    //https://leetcode.com/problems/two-sum/submissions/
    //Accepted

}
