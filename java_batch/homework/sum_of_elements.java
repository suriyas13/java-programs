import java.util.Scanner;

public class sum_of_elements {
    static Scanner sc = new Scanner(System.in);

    public static void sum_of_elements_1D() {
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void sum_of_elements_2D() {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        System.out.println("Enter the type of array(1D 0r 2D):");
        int typearr = sc.nextInt();
        switch (typearr) {
            case 1:
                sum_of_elements_1D();
                break;
            case 2:
                sum_of_elements_2D();
                break;
            default:
                System.out.println("Select 1 or 2");
        }
    }
}
