package com.aditya.day3;
//https://workat.tech/problem-solving/practice/merge-two-sorted-arrays

import java.sql.SQLOutput;
import java.util.Arrays;

class Merge2SortedArrays {
    static int[] mergeSortedArrays(int[] A, int[] B) {
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if(A[i] < B[j]) {
                C[k] = A[i];
                k++;
                i++;
            } else {
                C[k] = B[j];
                k++;
                j++;
            }
        }
        while (i < A.length) {
            C[k] = A[i];
            k++;
            i++;
        }
        while(j < B.length) {
            C[k] = B[j];
            k++;
            j++;
        }
        return C;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4};
        int[] b = {2, 4, 5, 5};
        System.out.println(Arrays.toString(mergeSortedArrays(a,b)));
    }
}