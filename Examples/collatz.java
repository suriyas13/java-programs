import java.util.Scanner;
class collatz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                
            }else {
                n=(3*n)+2;
                
            }
            count++;
        }
        System.out.println(count);
    }
}