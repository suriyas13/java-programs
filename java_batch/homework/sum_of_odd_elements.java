import java.util.Scanner;

public class sum_of_odd_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
