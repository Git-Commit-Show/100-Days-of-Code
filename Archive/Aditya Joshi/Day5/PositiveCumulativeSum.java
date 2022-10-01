//https://workat.tech/problem-solving/practice/positive-cumulative-sum
package com.aditya;
import java.util.*;

public class PositiveCumulativeSum {
    static List<Integer> getPositiveCumulativeSum (int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (sum(arr,i) > 0){
                result.add(sum(arr,i));
            }
        }
        return result;
    }
    private static int sum(int[] arr, int i) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += arr[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -6};
        System.out.println(getPositiveCumulativeSum( arr));
    }
}
