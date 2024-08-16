
import java.util.Scanner;

public class redorblankant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total ants:");
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].equals("Red")) {
                flag++;
            } else {
                flag--;
            }
        }
        if (flag == 0) {
            System.out.println("Peaceful");
        } else {
            System.out.println("Not Peaceful");
        }
    }

}
