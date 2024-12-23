import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        String s = "Suriya";
        float f = 10.545f;
        double d = 10.548575;
        System.out.println(n);
        System.out.println(s);
        System.out.printf("%.1f\n", f);
        System.out.printf("%.2f\n", d);
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String str = sc.nextLine();
        sc.nextLine();
        int a = sc.nextInt();
        System.out.println(c);
    }
}
