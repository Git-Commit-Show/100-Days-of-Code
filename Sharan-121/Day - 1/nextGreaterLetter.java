public class nextGreaterLetter {
    public static void main(String[] args) {
        char arr[] = { 'c','d' ,'f', 'j' };
        char target = 'j';

        System.out.println(arr[search(arr, target, 0, arr.length - 1)]);

    }

    public static int search(char arr[], char target, int start, int end) {

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start % arr.length;
    }
}
