import java.util.Scanner;

public class fibonacci {
    public static void findfibo(int n) {
        int[] f = new int[n];
        int f1 = 1, f2 = 2;
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f1;
            f1 = f2;
            f2 += f[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findfibo(n);
    }
}
