class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            mid=(start+end)/2;
            if(numbers[mid]>=target){
                end-=1;
            }
            else if(numbers[mid]<target){
                for(int i=start+1;i<=end;i++){
                    if(numbers[start]+numbers[i]==target){
                        return new int[] {start+1, i+1};
                    }
                }
                start+=1;
            }
        }
        return new int[] {start+1, start+2};
    }
}