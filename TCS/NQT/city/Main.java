import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int steps = 0, sum = arr[0];
        int add[] = new int[n - 1];
        for (int i = 1; i < n; i++) {
            sum &= arr[i];
            if (i < n - 1) {
                add[i - 1] = sum;
            }
        }
        if (sum != 0) {

        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(add[i]);
        }
        System.out.println(sum);
        System.out.println(10 & 11);
    }
}
