class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor=arr2[0];
        for(int i=0;i<arr2.length-1;i++){
            xor=xor^arr2[i+1];
        }
        int sum=arr1[0];
        for(int j=1;j<arr1.length;j++){
            sum=sum^(arr1[j]);
        }
        return sum&xor;
    }
}