public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=0; // the pointer till sorted array

        // Input: nums = [0,1,2,3,4],2,2,3,3,4]

        while (i < nums.length){
            if (nums[i] == nums[k]){
                i++;
            } else {
                k++;
                nums[k] = nums [i];
            }
        }
        return k+1;
    }

}
