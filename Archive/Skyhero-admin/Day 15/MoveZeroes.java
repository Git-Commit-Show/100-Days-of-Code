class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==0){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }   
            }
        }
    }
}