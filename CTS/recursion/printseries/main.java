import java.util.Scanner;

public class main {
    public static int numberseries(int n, int i) {
        if (n == i) {
            System.out.println(i);
            return i;
        }
        System.out.println(i);
        return numberseries(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberseries(n, 1);
    }
}
