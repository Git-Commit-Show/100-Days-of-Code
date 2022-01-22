public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {4,3,0,1};
        System.out.println(missingNumber(nums));
    }
    //https://leetcode.com/problems/missing-number/
    public static int missingNumber(int[] nums) {
        cyclic(nums);
        int ans=nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static void cyclic(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct_index = arr[i];// 0 should be at index 0
            //if arr[0] != arr[2] => 3 != 4 =>true and swap
            if(correct_index==arr.length){//ignoring the out-of-bounds element, if array is of size 4, then
                //element 4 will be out of bounds
                i++;
            }
            if(arr[i]!=arr[correct_index]){
                swap(arr, correct_index, i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
