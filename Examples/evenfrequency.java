import java.util.Scanner;
class evenfrequency{
    public static void check(String str){
        int count=1;
        int sum=0;
        char[] c=str.toCharArray();
        int i=1;
        for(int i=1;i<c.length;i++){
            if(c[i]==c[i-1]){
                count++;
            }else {
                if(count%2==0){
                    sum+=count;
                    
                }
    
                    count=1;
                
            }
        }
        if(count%2==0)
            sum+=count;
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        check(str);;
    }
}