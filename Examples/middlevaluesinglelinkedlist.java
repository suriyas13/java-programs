import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class middlevaluesinglelinkedlist{
    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        ListNode fast=node1;
        ListNode slow=node1;
         while(fast.next !=null && fast.next.next !=null){
            fast=fast.next.next;
            slow=slow.next;
         }
         System.out.println(slow.val);
    
        

    }
}