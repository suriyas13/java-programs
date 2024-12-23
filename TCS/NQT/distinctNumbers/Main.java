import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (i != j && (i * j) == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
