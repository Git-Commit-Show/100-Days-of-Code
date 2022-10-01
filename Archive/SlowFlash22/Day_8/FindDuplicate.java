public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    //using cyclic sort
    public static int findDuplicate(int[] nums) {
        int i=0;
        while((i<nums.length)){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        int ans=0;
        for(i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                ans = nums[i];
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
