import java.util.Scanner;
class removevowels{
    public static String rem(String a){
        int[] count=new int[26];

    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String str="";
        for(int i=0;i<a.length();i++){
            char s=a.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U'){
                continue;
            }
            else{
                str+=s;
            }
        }
        rem(a);
        System.out.println(str);
}
}
