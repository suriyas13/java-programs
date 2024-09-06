import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance[] = new int[3];
        System.out.println("Enter the number of Customers:");
        int n = sc.nextInt();
        int customer[] = new int[n];
        int flag = 0;
        System.out.println("Enter the customers");
        for (int i = 0; i < n; i++) {
            customer[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (customer[i] == 30) {
                balance[0]++;
            } else if (customer[i] == 60) {
                if (balance[0] == 0) {
                    System.out.println("Transaction Failed");
                    flag = 1;
                    break;
                } else {
                    balance[1]++;
                    balance[0]--;
                }
            } else {
                if (balance[1] == 0 || balance[0] < 3) {
                    System.out.println("Tranaction Failed");
                    flag = 1;
                    break;
                } else {
                    if (balance[1] < 1 && balance[1] < 1) {
                        balance[2]++;
                        balance[1]--;
                        balance[0]--;
                    } else if (balance[0] >= 3) {
                        balance[0] -= 3;
                        balance[2]++;
                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println("Transaction Successful");
        }
    }
}
