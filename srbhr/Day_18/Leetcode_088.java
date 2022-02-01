import java.util.Arrays;

public class LeetCode_088 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int maxIndex = m + n - 1;
        while (m > 0 || n > 0) {
            int num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
            if (m > 0) {
                num1 = nums1[m - 1];
            }
            if (n > 0) {
                num2 = nums2[n - 1];
            }
            if (num1 > num2) {
                nums1[maxIndex] = num1;
                m--;
            } else {
                nums1[maxIndex] = num2;
                n--;
            }
            maxIndex--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0}, nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(num -> {
            System.out.print(num + " ");
        });
    }
}