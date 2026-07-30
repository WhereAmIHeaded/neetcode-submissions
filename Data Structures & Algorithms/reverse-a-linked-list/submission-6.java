/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode node1= head;
        ListNode node2= head.next;
        ListNode temp= head.next.next;
        head.next=null;
        while(temp!=null){
            node2.next=node1;
            node1=node2;
            node2=temp;
            temp=temp.next;
        }
        node2.next=node1;
        return node2;

        
    }
}
