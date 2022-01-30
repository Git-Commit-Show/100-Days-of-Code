import java.util.ArrayList;

public class firstLastSorted {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        result.add(firstPos(arr, target, 0, arr.length - 1));
        result.add(lastPos(arr, target, 0, arr.length - 1));
        System.out.println(result);

    }

    public static int firstPos(int arr[], int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return res;
    }

    public static int lastPos(int arr[], int target, int start, int end) {

        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return res;
    }

}
