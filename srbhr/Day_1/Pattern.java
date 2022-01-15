import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            for (int k = 0; k < i; k++) {
                // System.out.print(t);
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
