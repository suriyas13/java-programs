import java.util.Scanner;
class ternary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String greater= (a>b)?"A is greater":"B is greater";
        System.out.print(greater);
        
    }
}