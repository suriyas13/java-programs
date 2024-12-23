import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            if (k == arr[i]) {
                count++;
                flag = 1;
            } else if (flag == 0) {
                int sum = arr[i];
                int curr = i;
                for (int j = i + 1; j < n; j++) {
                    sum += arr[j];
                    curr = j - 1;
                    if (sum == k) {
                        count++;
                        sum = arr[i];
                    } else if (sum > k) {
                        j = curr;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
