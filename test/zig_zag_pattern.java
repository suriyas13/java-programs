import java.util.Scanner;

class zig_zag_pattern {
    static int recursiongcd(int a, int b) {
        if (b == 0)
            return a;
        return recursiongcd(b, a % b);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int gcd = recursiongcd(m, n);
        System.out.println(gcd);
    }
}
