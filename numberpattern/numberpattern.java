
import java.util.Scanner;

public class numberpattern {
    public static void numbertriangle(int n) {
        System.out.println("numbertriangle");
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");

        }
    }

    public static void numbertrianglereset(int n) {
        System.out.println("numbertrianglereset");
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");

        }
    }

    public static void xpattern(int n) {
        System.out.println("Xpattern");
        int temp = n, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = n;
        int t = count;
        int[] arr = new int[count];
        while (temp > 0) {
            arr[count - 1] = temp % 10;
            count--;
            temp /= 10;
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i == j || j == t - i - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numbertriangle(n);
        numbertrianglereset(n);
        xpattern(12345);

    }

}
