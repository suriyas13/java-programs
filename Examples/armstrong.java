import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = (int) Math.log10(n) + 1;
        int m = n;
        int arm = 0;
        while (m > 0) {
            int dig = m % 10;
            arm = arm + (int) Math.pow(dig, len);
            m = m / 10;
        }
        System.out.println(arm);
    }
}
