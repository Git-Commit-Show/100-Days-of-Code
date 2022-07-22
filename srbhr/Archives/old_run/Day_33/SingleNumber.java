public class SingleNumber {
/**/
    public int singleNumber(int[] nums){
        int ans = nums[0];
//         learnt the XOR method 😎
        for (int i=1;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
