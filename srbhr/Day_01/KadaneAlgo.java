import java.util.ArrayList;

public class KadaneAlgo {

    public static int maxSubarraySum(int[] arr, ArrayList<Integer> subArray) {
        int currSum = 0;
        int maxSum = arr[0];
        int arrStart = 0;
        // { 2, 1, -3, 4, -1, 2, 1, -5, 4 };
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum; // get max sum
                subArray.clear(); // if due to prev iters there is something in here then dump
                subArray.add(arrStart); // add the starting max
                subArray.add(i); // add the ending max
            }

            if (currSum < 0) {
                currSum = 0;
                arrStart = i + 1;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, -3, 4, -1, 2, 1, -5, 4 };

        ArrayList<Integer> subArray = new ArrayList<>();

        int output = maxSubarraySum(arr, subArray);
        System.out.println("MaxSubArraySum is : " + output);
        System.out.print("The subArray holding max value is : ");
        for (int i = subArray.get(0); i <= subArray.get(1); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}