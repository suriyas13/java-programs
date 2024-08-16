import java.util.Scanner;
class Loan{
public static void main(String[] args){
    int age,salary,amount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age");
    age=sc.nextInt();
    System.out.println("Enter your salary");
    salary=sc.nextInt();
    if(salary>=20000 || age<=25)
    {
        System.out.println("Enter the required loan amount");
        amount=sc.nextInt();
        if(amount<=50000){
            System.out.println("Eligible for loan");
        }
        else{
        System.out.print("maximum loan amount is 50000");
        }
    }
    else{
        System.out.print("you are not eligible for loan");
    }
    
}
}