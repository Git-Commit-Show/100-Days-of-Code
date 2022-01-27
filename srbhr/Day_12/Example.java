
import java.util.*;

public class Example {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15, 19 };
        int target = 13;
        int[] arr = twoSum(nums, target);
        for (int i = 0; i < 2; i++) {
            System.out.print("[" + arr[i] + " ]");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int j = 0; j < nums.length; j++) {
            Integer value = map.get(target - nums[j]);
            if (value == null) { /* no match found */
                map.put(nums[j], j);
            } else { /* pair found, updating index */
                arr[0] = value;
                arr[1] = j;
                break; // loop exit
            }
        }
        return arr;
    }
}
