import java.util.Scanner;

public class FibbonacciTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int a = 0;
            int b = 1;
            for (int l = 0; l < n; l++) {
                System.out.println(a);
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}