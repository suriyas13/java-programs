import java.util.Scanner;
public class recnumbers{
    public static void main(String[] args ){
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range:");
        n=sc.nextInt();
        rec(0,n);
    }
    public static void rec(int i,int n){
        System.out.println(i);
        i++;
        if(i<n){
        rec(i,n);
        }
    }
}