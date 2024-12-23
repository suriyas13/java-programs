import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int door[] = new int[n];
        for (int i = 0; i < n; i++) {
            door[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (door[i] == 0) {
                door[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (door[j] == 0) {
                        door[j] = 1;
                    } else if (door[j] == 1) {
                        door[j] = 0;
                    }
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
