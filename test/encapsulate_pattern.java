import java.util.Scanner;

public class encapsulate_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.println("- ");
                }
            }
            System.out.println("");
        }
    }
}