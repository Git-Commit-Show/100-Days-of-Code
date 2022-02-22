// https://www.thecodingshala.com/

public class RotateArray {
    // reverse the array in k segments
    public void rotate(int[] nums, int k){
        int len = nums.length;
        k = k%len;
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }

    public  void  reverse(int[] nums, int i, int k){
        while (i < k){
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            i++;
            k--;
        }
    }
}
