import java.util.Scanner;

// import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class RotateNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int noOfDigits = 0;
        int temp = n;
        int div = 1;
        int mult = 1;

        while (temp != 0) {
            temp = temp / 10;
            noOfDigits++;
        }

        k = k % noOfDigits;
        if (k < 0) {
            k = k + noOfDigits;
        }

        for (int i = 1; i <= noOfDigits; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;
        int answer = r * mult + q;
        System.out.println(answer);
        scn.close();

    }

}
