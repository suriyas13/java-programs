import java.util.Scanner;

class car_parking {
    static Object[][] slot;
    static Object[] car;
    static Object[] bike;
    static Object[] bicycle;
    static Scanner sc = new Scanner(System.in);

    public static void create_array() {
        car = new Object[10];
        bike = new Object[10];
        bicycle = new Object[10];
        slot = new Object[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                slot[i][j] = "-";
            }
        }
        System.out.println("Success");
    }

    public static void display(Object[][] slot) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(slot[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void insert_vehicle(Object[][]){
        int type=sc.nextInt();
        String strnumber=sc.next();
        int time=sc.nextInt();

    static int car_start = 0, car_end = 3, bike_start = 4, bike_end = 7, bicycle_start = 8, bicycle_end = 9;
    static int car_start_row=9;if(type==1)
    {
        if (car_start <= car_end) {
            slot[car_start_row][car_start] = type;
            car_start++;
        } else {
            car_start_row--;
            car_start = 0;
        }
    }
    }

    public void method1() {
        
        System.out.println("Enter your Choice:");
        int n = sc.nextInt();
        while (n != 6) {
            switch (n) {
                case 1: {
                    create_array();
                    break;
                }
                case 2: {
                    display(slot);
                    break;
                }
                case 3: {
                insert_vehicle();
                break;
                }
                // case 4:
                // {
                // take_out_vehicle();
                // break;
                // }
                // case 5: {
                // history();
                // break;
                // }
                // case 6:
                // {
                // exit();
                // break;
                // }

            }
            System.out.println("Enter your Choice:");
            n = sc.nextInt();

        }
    }

    public static void main(String[] args) {
        int[] car = new int[10];
        car_parking obj = new car_parking();
        System.out.println("1-Create Array");
        System.out.println("2-Display");
        System.out.println("3-Insert Vehicle");
        System.out.println("4-Take Out Vehicle");
        System.out.println("5-History");
        System.out.println("6-Exit");
        obj.method1();

    }
}