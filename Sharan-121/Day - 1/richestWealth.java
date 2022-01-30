package Basics;
public class richestWealth {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 1, 2, 3 },
                { 5, 7, 8, 9 }
        };
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum(arr[i]) > max){
                max = sum(arr[i]);
            }
        }
        System.out.println(max);
    }
    public static int sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
