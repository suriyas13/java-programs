import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jack[] = new int[n];
        int jill[] = new int[n];
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            jack[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            jill[i] = sc.nextInt();
        }
        int sum1 = 0, sum2 = 0;
        int m = 0;
        while (n > 0) {
            int jacki = -1;
            int jackmax = Integer.MIN_VALUE;
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i] && jackmax < jack[i]) {
                    jackmax = jack[i];
                    jacki = i;
                }
            }
            if (jacki != -1) {
                sum1 += jackmax;
                visited[jacki] = true;
            }
            int jillmax = Integer.MIN_VALUE;
            int jilli = -1;
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i] && jillmax < jill[i]) {
                    jillmax = jill[i];
                    jilli = i;
                }
            }
            if (jilli != -1) {
                sum2 += jillmax;
                visited[jilli] = true;
            }
            n--;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        if (sum1 > sum2) {
            System.out.println("Jack");
        } else if (sum1 < sum2) {
            System.out.println("Jill");
        } else {
            System.out.println("Tie");
        }
    }
}
