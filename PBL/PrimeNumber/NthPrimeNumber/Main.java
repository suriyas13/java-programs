import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();

        int k = 2;
        int d = 0, i, c = 0;
        int p = 0;
        if (input1 == 1) {
            System.out.println("2");
            return;
        }
        if (input1 == 2) {
            System.out.println("3");
            return;
        }
        while (d <= input1) {
            for (i = 2; i < k / 2; i++) {
                if (k % i == 0) {
                    c++;
                }

            }
            if (c == 0) {
                d++;
                p = k;
            }
            k++;
            c = 0;
        }
        System.out.println(p);
    }
}
