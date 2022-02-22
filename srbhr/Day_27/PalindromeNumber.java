public class PalindromeNumber {
    public boolean isPalindrome(int x){
        int nums = x;
        int reverse = 0;

        if (x<0){
            return  false;
        }

        while (x !=0) {
            int remainder = x%10;
            reverse = reverse*10+remainder;
            x /= 10;
        }

        return reverse == nums;
//        return null;

        // https://leetcode.com/problems/palindrome-number/submissions/
        // accepted
    }
}
