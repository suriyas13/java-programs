import java.util.Scanner;

class findtree {
    public static String findtree_row_wise(int r, int c, int tn) {
        if (tn >= 1 && tn <= c || tn % c == 0 && tn <= r * c || (tn - 1) % c == 0 && tn < r * c) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static String findtree_column_wise(int r, int c, int tn) {
        if (tn % r == 0 && tn <= r * c || tn % r == 1 && tn <= r * c || tn <= r * c - r && tn > r * c - r - r) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int tn = sc.nextInt();
        String ans = findtree_row_wise(r, c, tn);
        String ans2 = findtree_column_wise(r, c, tn);
        System.out.println("Row wise:" + ans);
        System.out.println("Column wise:" + ans2);
    }
}