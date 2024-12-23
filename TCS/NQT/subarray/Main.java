import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxsum = 0;
        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            for (int j = i; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sum += arr[j];
                    break;
                } else {
                    sum += arr[j];
                }
            }
            if (maxsum < sum) {
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}
