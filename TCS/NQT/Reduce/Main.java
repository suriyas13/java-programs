import java.util.Scanner;

public class Main {
    public static int findfactors(int n) {
        int max = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = 0;
        while (n > 0) {
            int fact = findfactors(n);
            n -= fact;
            steps++;
        }
        System.out.println(steps);
    }
}
