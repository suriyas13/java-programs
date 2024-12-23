import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ex = sc.nextInt();
        int total = 0;
        int empty = 0;
        while (n > 0) {
            total++;
            empty++;
            n--;
            if (empty == ex) {
                n++;
                empty = 0;
            }
        }
        System.out.println(total);
    }
}
