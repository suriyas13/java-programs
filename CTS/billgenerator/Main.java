import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int puff = sc.nextInt();
        int cd = sc.nextInt();
        int pprice = p * 100;
        int puffprice = puff * 20;
        int cdprice = cd * 10;
        System.out.println(p);
        System.out.println(puff);
        System.out.println(cd);
        System.out.println(pprice + puffprice + cdprice);
    }
}
