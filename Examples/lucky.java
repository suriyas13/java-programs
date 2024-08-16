import java.util.Scanner;

public class lucky {
    public static int calculate(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of digit:");
        int n = sc.nextInt();
        int end = (int) Math.pow(10, n);
        String[] arr = new String[end];
        for (int i = 0; i < end; i++) {
            arr[i] = String.format("%0" + n + "d", i);
        }
        int sum1 = 0, sum2 = 0, count = 0;
        String firsthalf, secondhalf;
        for (int i = 0; i < end; i++) {
            sum1 = calculate(firsthalf = arr[i].substring(0, n / 2));
            sum2 = calculate(secondhalf = arr[i].substring(n / 2));
            if (sum1 == sum2)
                count++;
        }
        System.out.println("Lucky numbers {" + n + "} is" + count);
    }
}
