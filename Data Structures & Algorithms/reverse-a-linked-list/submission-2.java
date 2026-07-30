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
        if(head==null|| head.next==null) return head;
        ListNode before = head;
        ListNode after = head.next;
        head.next=null;
        ListNode temp= after.next;
        while(temp!=null){
            after.next=before;
            before=after;
            after=temp;
            temp=temp.next;
        }
        after.next=before;
        return after;



    }
}
