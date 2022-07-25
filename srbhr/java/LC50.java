public class LC50 {
    public double myPow(double x, int n) {

        double output;
        long power;

        power = n;
        output = 1.0;

        if (power < 0)
            power *= -1;

        while (power > 0) {
            if (power % 2 == 1) {
                output *= x;
                power -= 1;
            } else {
                x *= x;
                power /= 2;
            }
        }

        if (n < 0)
            return (double) 1 / (double) output;

        return output;
    }
}
