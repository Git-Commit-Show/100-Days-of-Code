//https://workat.tech/problem-solving/practice/even-number-of-digits
package com.aditya;
import java.util.ArrayList;
import java.util.List;

public class EvenDigits {
    int getDigitCount(int n) {
        int count = 0;
        if(n == 0) {
            return 1;
        }
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> evenDigitList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(getDigitCount(arr[i]) % 2 == 0) {
                evenDigitList.add(arr[i]);
            }
        }
        return evenDigitList;
    }
}

