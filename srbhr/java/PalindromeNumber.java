public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int original = x;
        int rem;
        int reverse = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            rem = x % 10;
            reverse = reverse * 10 + rem;
            x /= 10;
        }
        if (reverse == original) {
            return true;
        }
        return false;
    }
}