package com.aditya.day4;

public class ImplementMergeSort {
        void merge (int[] arr, int low, int mid, int high) {
            int subArr1Size = mid - low + 1, subArr2Size = high - mid;
            int[] subArr1 = new int[subArr1Size], subArr2 = new int[subArr2Size];
            for (int i = 0; i < subArr1Size; i++) {
                subArr1[i] = arr[low + i];
            }
            for (int i = 0; i < subArr2Size; i++) {
                subArr2[i] = arr[mid + 1 + i];
            }
            int i = 0, j = 0, k = low;
            while (i < subArr1Size && j < subArr2Size) {
                if( subArr1[i] <=  subArr2[j]) {
                    arr[k] = subArr1[i];
                    i++;
                }
                else {
                    arr[k] = subArr2[j];
                    j++;
                }
                k++;
            }
            while (i < subArr1Size) {
                arr[k++] = subArr1[i++];
            }
            while (j < subArr2Size) {
                arr[k++] = subArr2[j++];
            }
        }
        void mergesort (int[] arr, int low, int high) {
            if (high > low) {
                int mid = (high + low) / 2;
                mergesort (arr, low, mid);
                mergesort (arr, mid + 1, high);
                merge (arr, low, mid, high);
            }
        }
        void mergeSort (int[] arr) {
            int n = arr.length;
            mergesort (arr, 0, n - 1);
        }

}
