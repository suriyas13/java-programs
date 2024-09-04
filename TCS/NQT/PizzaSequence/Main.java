import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of pizzas");
        int n = sc.nextInt();
        int[] p = new int[n];
        System.out.println("Enter the no of Flavor:");
        int f = sc.nextInt();
        System.out.println("Enter the type of pizza:");
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int index = 0, maxindex = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] <= f - 1) {
                index++;
            } else {
                if (maxindex < index) {
                    maxindex = index;
                }
                index = 0;
            }
        }
        if (index > maxindex) {
            System.out.println(index);
        } else {
            System.out.println(maxindex);
        }
    }
}
