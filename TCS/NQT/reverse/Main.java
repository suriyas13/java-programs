import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = (int) Math.log10(n) + 1;// length of the n
        int[] arr = new int[len];
        int k = 0;
        while (n > 0) {
            arr[k] = n % 10;
            n /= 10;
            System.out.print(arr[k] + " ");
            k++;
        }

    }
}
