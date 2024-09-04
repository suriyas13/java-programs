import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of steps:");
        int n = sc.nextInt();
        System.out.println("Enter the current step:");
        int current = sc.nextInt();
        System.out.println("Enter the most skip step:");
        int x = sc.nextInt();
        int[] steps = new int[n + 1];
        steps[current] = 1;
        for (int i = current + 1; i <= n; i++) {
            for (int j = 1; j <= x && i - j >= current; j++) {
                steps[i] += steps[i - j];
            }
        }
        System.out.println(steps[n]);
    }
}
