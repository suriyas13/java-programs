import java.util.Scanner;
class sumofdiagonalmatrix{
    public static int calculate(int n,int[][] a){
        int sum=0;
        for(int i=0;i<n;i++){
             sum+=a[i][i];
        }
        return sum; 
    }
    public static int rev(int n,int[][] a){
        int sum=0;
        for(int i=0;i<n;i++){
             sum+=a[i][n-i-1];
        }
        return sum; 
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of matrix:");
    int n=sc.nextInt();
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println(calculate(n,a));
    System.out.println(rev(n,a));
    }
}