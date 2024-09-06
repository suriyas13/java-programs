import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the energy of Hero");
        int hero = sc.nextInt();
        System.out.println("Enter the no. of Zombies");
        int n = sc.nextInt();
        int[] z = new int[n];
        System.out.println("Enter the energy of zombie");
        for (int i = 0; i < n; i++) {
            z[i] = sc.nextInt();
        }
        int flag = 1;
        for (int i = 0; i < n; i++) {
            if (hero < z[i]) {
                flag = 0;
                break;
            } else {
                hero -= ((z[i] % 2) + (z[i] / 2));
            }
        }
        if (flag == 1 && hero > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
