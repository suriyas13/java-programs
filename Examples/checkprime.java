import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if (n == 2) {
            flag = 0;
        } else if (n == 0 || n == 1) {
            flag = 1;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not");
        }
    }
}
