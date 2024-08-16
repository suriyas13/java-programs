import java.util.Scanner;
import java.lang.Math;
class cointoss{
    public static float factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
             fact*=i;
        }
        return fact;
    }
    public static float calculate(int a,int b){
        float n=factorial(a);
        float r=factorial(b);
        float ncr=n/r*(factorial(a-b));
        int x=(int)Math.pow(2,a);
        float ans= ncr / x ;
        return ans;
    }
    public static void main(String[] args){
    int a,b;
    float ans;
    Scanner sc=new Scanner(System.in);
    System.out.print("Input:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.printf("Output:%.6f"+calculate(a,b));
    }
}
