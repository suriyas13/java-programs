import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        for (int i = s; i <= e; i++) {
            int flag = i;
            int sum = 0;
            while (flag > 0) {
                int digit = flag % 10;
                sum = 10 * sum + digit;
                flag /= 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
