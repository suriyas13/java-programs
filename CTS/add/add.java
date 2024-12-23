import java.util.Scanner;

class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int last = n % 100;
        while (n > 99) {
            n /= 10;
        }

        int sum1 = last % 10 + n / 10;
        int sum2 = last + n;

        System.out.println(sum1);
        System.out.println(sum2);
    }
}