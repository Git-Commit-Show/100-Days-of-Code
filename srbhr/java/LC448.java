import java.util.ArrayList;
import java.util.List;

public class LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n;
        ArrayList<Integer> arrOut = new ArrayList<Integer>(); 
        
        for (int i=0; i<nums.length; i++) {
            n = Math.abs(nums[i])-1;
            if (nums[n] > 0) {
                nums[n] *= -1;
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                arrOut.add(i+1);
            }
        }
        
        return arrOut;
    }
}
