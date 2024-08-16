
public class rotationnumbersquare {

    public static void reverses(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotateArray(int[] arr, int i, int size) {
        reverses(arr, 0, i +);
        reverses(arr, i + 1, size - 1);
        reverses(arr, 0, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");

            }
            rotateArray(arr, i, size);
            System.out.println("");
        }

    }
}
