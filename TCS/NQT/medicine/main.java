import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int perday = sc.nextInt();
        int patients[];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Day " + i);
            int cap = 0;
            while (cap <= perday)
                if (arr[i] >= 81 || arr[i] >= 1 && arr[i] <= 10) {
                    System.out.println(arr[i]);
                    cap++;
                    i++;
                }

        }

        System.out.println(count);
    }
}
