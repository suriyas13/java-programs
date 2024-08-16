import java.util.Scanner;
class Stack{
    Node top;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Stack(){
        top=null;
    }
    public void push(int val){
        Node newnode=new Node(val);
        if(top == null){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }
    public void pop(){
        if(top.data == -1){
            System.out.println("Stack is empty");
        }else{
            top=top.next;
        }
    }
}
class Main(
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack stack=new Stack();
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char ch=
        }
    }
)
