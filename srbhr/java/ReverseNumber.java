public class ReverseNumber {
    public int reverse(int x) {
        long reverse = 0;
        int r;
        
        while (x != 0) {
            r = x % 10;
            reverse = reverse*10 + r;
            x /= 10;
        }
        
        if (reverse >= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int)reverse;
    }
}
