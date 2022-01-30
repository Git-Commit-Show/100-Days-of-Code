public class sortedRotated {
    public static void main(String[] args) {

    }
}

class Solution {
    public int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        int firstTry = binSearch(arr, 0, pivot, target);
        if (firstTry != -1) {
            return firstTry;
        }
        return binSearch(arr, pivot + 1, arr.length - 1, target);
    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int binSearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}