import java.util.Arrays;

public class movezeros {
    int[] movezerosm1(int[] arr, int len) {
        int a[] = new int[len];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                a[j++] = arr[i];
            }
        }
        return a;
    }

    int[] movezerosm2(int[] arr, int len) {
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        movezeros mz = new movezeros();
        int[] arr = { 0, 1, 0, 4, 12 };
        int len = arr.length;
        int[] m1 = mz.movezerosm1(arr, len);
        int[] m2 = mz.movezerosm1(arr, len);
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
    }
}
