import java.util.Scanner;

public class Main {
    static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of pencils in Shop:");
        int tpencils = sc.nextInt();
        System.out.println("Enter the No. of erasers in Shop:");
        int terasers = sc.nextInt();
        System.out.println("Enter the pencils to buy");
        int npencils = sc.nextInt();
        System.out.println("Enter the No. of erasers to buy");
        int nerasers = sc.nextInt();
        int pencilscomb = fact(tpencils) / (fact(npencils) * fact(tpencils - npencils));
        int eraserscomb = fact(terasers) / (fact(nerasers) * fact(terasers - nerasers));
        int ans = pencilscomb * eraserscomb;
        System.out.println("The number");
        System.out.println(ans);
    }
}
