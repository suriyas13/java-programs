import java.util.Scanner;

public class maximum_member {
    public static int find_maximum_member(int[] entry, int[] leave, int time) {
        int total = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < time; i++) {
            total = total + entry[i] - leave[i];
            if (max < total) {
                max = total;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int[] entry = new int[time];
        int[] leave = new int[time];
        for (int i = 0; i < time; i++) {
            entry[i] = sc.nextInt();
        }
        for (int i = 0; i < time; i++) {
            leave[i] = sc.nextInt();
        }
        int ans = find_maximum_member(entry, leave, time);
        System.out.println(ans);
    }
}
