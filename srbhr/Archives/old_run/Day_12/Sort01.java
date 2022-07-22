public class Sort01 {
    public static void sortZeroOne(int[] arr) {
        int zero = 0;
        int one = arr.length - 1;
        int i = 0;
        while (one > zero) {
            if (arr[zero] == 0 && arr[one] == 1) {
                zero++;
                one--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 0, 1 };

    }
}