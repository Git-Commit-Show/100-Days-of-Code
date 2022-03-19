package com.aditya;
//https://workat.tech/problem-solving/practice/cumulative-sum

import java.util.Arrays;

public class CumulativeSum {

//    SOLVED USING RECURSION

//    static int[] getCumulativeSum (int[] arr) {
//
//    int[] result = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = sum(arr,i);
//        }
//
//    return result;
//    }
//
//    private static int sum(int[] arr, int i) {
//        if (i == 0){
//            return arr[i];
//        }
//        return arr[i] + sum(arr,i-1);
//    }



//    BY ITERATION

    static int[] getCumulativeSum (int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = sum(arr,i);
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

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(getCumulativeSum(arr)));
    }

}
