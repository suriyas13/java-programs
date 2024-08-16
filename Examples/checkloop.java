import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class checkloop{
    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        
         ListNode slow=node1;
         ListNode fast=node1;
         boolean a=false;
          while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                a=true;
                break;
            }
            
            
          }
          if(a){
            System.out.println("True");
          }
          else{
            System.out.println("False");
          }

    }
}