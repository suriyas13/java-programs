import java.util.Scanner;

class primenumber {
    public void checkprime(int num) {
        boolean flag = true;
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag == true)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }

}

class primenum {
    public static void main(String[] args) {
        primenumber prime = new primenumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        while (!sc.hasNextInt()) {
            System.out.println("Enter a valid number:");
            sc.next();
        }
        int num = sc.nextInt();
        prime.checkprime(num);
    }
}