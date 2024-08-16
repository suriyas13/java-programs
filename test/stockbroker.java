import java.util.Scanner;

public class stockbroker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no of days:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0], first, last;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                first = i;
            } else {
                if (max < arr[i]) {
                    max = arr[i];
                    last = i;

                }
            }
        }

        int profit = arr[last] - arr[first];
        if (profit <= 0) {
            System.out.println("-1");
        } else {
            System.out.println(profit);
        }
    }

}
