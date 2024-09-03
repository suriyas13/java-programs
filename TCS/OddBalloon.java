import java.util.Scanner;

class OddBalloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);

        }
        int[] lowercase = new int[26];
        for (int i = 0; i < n; i++) {
            lowercase[arr[i] - 'a']++;
        }
        boolean flag = false;
        char ch = '\0';
        for (int i = 0; i < 26; i++) {
            if (lowercase[i] / 2 == 1) {
                ch = (char) (lowercase[i]);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(ch);
        }
    }
}