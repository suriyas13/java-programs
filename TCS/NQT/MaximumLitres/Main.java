import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total money");
        int m = sc.nextInt();
        System.out.println("Enter the price of plastic Bottle:");
        int pb = sc.nextInt();
        System.out.println("Enter the price of glass bottle:");
        int gb = sc.nextInt();
        System.out.println("Enter the price of empty glass bottle:");
        int eb = sc.nextInt();
        int litre = 0;
        int diff = gb - eb;
        while (m >= pb || m >= gb) {
            if (diff < pb && m >= gb) {
                litre++;
                m -= diff;
            } else {
                litre++;
                m -= pb;
            }
        }
        System.out.println(litre);
    }
}
