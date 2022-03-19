//https://workat.tech/problem-solving/practice/identical-twins
package com.aditya;

public class IdenticalTwins {

    static int getIdenticalTwinsCount (int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i!=j && arr[j] == arr[i] && i<j){
                    result ++;
                    break;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 1};
        System.out.println(getIdenticalTwinsCount(arr));
    }
}
