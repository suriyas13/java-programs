import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            int m = arr[i];
            if (count[m] % 2 == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
