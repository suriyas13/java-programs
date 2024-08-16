import java.util.Scanner;
class eg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int num1,num2;
       System.out.println("Enter num1:");
       num1=sc.nextInt();
       System.out.println("Enter num2:");
       num2=sc.nextInt();
       if(num1==num2)
             System.out.println("Equal");
       else
       System.out.println("Not equal");
    }
}