import java.util.Scanner;

public class main {
    public static int findfactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findfactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = findfactorial(n);
        System.out.println(m);
        int digit = 0;
        while (m > 0) {
            int d = m % 10;
            if (d != 0) {
                digit = d;
                break;
            }
            m /= 10;
        }
        System.out.println(digit);
    }
}
