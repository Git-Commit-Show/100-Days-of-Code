
public class MergeSort {

    public int[] mergeSort(int arr[], int low, int high) {
        if (low == high) {
            int[] baseArray = new int[1];
            baseArray[0] = arr[low];
            return baseArray;
        }
        int mid = low + (high - low) / 2;
        int[] firstSortedHalf = mergeSort(arr, low, mid);
        int[] secondSortedHalf = mergeSort(arr, mid + 1, high);
        int[] fullySorted = merge(firstSortedHalf, secondSortedHalf);
        return fullySorted;
    }

    public int[] merge(int[] arrA, int[] arrB) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] sortedArray = new int[arrA.length + arrB.length];

        while (i < arrA.length && j < arrB.length) {
            if (arrA[i] < arrB[j]) {
                sortedArray[k] = arrA[i];
                i++;
                k++;
            } else {
                sortedArray[k] = arrB[j];
                j++;
                k++;
            }
        }

        while (i < arrA.length) {
            sortedArray[k] = arrA[i];
            i++;
            k++;
        }

        while (j < arrB.length) {
            sortedArray[k] = arrB[j];
            j++;
            k++;
        }
        return sortedArray;
    }

    public static void main(String[] args) {

        MergeSort obj = new MergeSort();
        int[] arr = { 7, 4, 1, 3, 6, 8, 2, 5 };

        // int[] arr1 = { 1, 3, 5, 7 };
        // int[] arr2 = { 2, 4, 6, 8 };
        // int[] output = obj.merge(arr1, arr2);

        int[] output = obj.mergeSort(arr, 0, arr.length - 1);

        // System.out.println("Array after merging");

        for (int i : output) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
