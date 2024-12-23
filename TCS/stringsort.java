import java.util.Arrays;

public class stringsort {
    public static void main(String[] args) {
        String a = "suriya";
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
