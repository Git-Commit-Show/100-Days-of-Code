public class LC172 {
    public int trailingZeroes(int n) {
        int zeros = 0;
        int power = 5;
        
        for (int i=1;;i++) {
            zeros += (n/power);
            if (n/power == 0) {
                break;
            }
            power *= 5;
        }
        return zeros;
    }
}
