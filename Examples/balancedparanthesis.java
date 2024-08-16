import java.util.Scanner;
import java.util.Stack;
class balancedparanthesis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> sta=new Stack<>();
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if('('==s){
                sta.push(s);
            }
           else if (s == ')') {
                if (!sta.isEmpty() && sta.peek() == '(') {
                    sta.pop();
                } else {
                    sta.push(s);
                    break; 
                }
            }
        }
        if(sta.isEmpty()){
            System.out.println("Balanced Paranthesis");
        }
        else{
            System.out.println("Not balanced paranthesis");
        }
    }
}