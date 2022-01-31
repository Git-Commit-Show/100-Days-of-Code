class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res[]=new int [nums.length];
        int max=nums[0];
        res[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=Math.max(nums[i], nums[i]+res[i-1]);
            max=Math.max(max,res[i]);         
        }
        return max;
    }
}