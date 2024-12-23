import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (max < Math.abs(arr[i])) {
                max = Math.abs(arr[i]);
                b = a;
                a = max;
            }
        }
        System.out.println(a * b);
        System.out.println(a + b);
    }
}
