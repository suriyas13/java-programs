import java.util.Arrays;

public class leader {

    public static void main(String[] args) {
        int a[] = { 1, 5, 2, 4, 3, 1 };
        System.out.println(Arrays.toString(a));
        // 1st approach
        for (int i = 0; i < a.length; i++) {
            int f = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                System.out.print(a[i] + " ");
        }
        System.out.println();
        // 2nd approach
        int stack[] = new int[a.length], top = -1;
        stack[++top] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] >= stack[top]) {
                stack[++top] = a[i];
            }
        }
        while (top != -1) {
            System.out.print(stack[top--] + " ");
        }
    }
}
