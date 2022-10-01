package Basics;
public class evenDigits {
    public static void main(String[] args) {
        int arr[] = { 88, 88782, 542, 23, -444 };
        int numCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                numCount++;
            }
        }
        System.out.println(numCount);
    }

    public static boolean isEven(int num) {
        int digitCount = 0;
        if (num < 0) {
            num = num * -1;
        } else if (num == 0) {
            digitCount = 1;
        }

        while (num > 0) {
            digitCount += 1;
            num = num / 10;
        }

        return (digitCount % 2 == 0) ? true : false;
    }
}
