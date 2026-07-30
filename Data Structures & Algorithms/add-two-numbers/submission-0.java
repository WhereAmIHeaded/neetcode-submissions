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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int num=0;
        ListNode dummy = new ListNode(0);
        ListNode runner = dummy;
        while(curr1!= null && curr2!= null){
            num+= curr1.val + curr2.val;
            runner.next= new ListNode (num%10);
            if(num>= 10){
                num=1;
            }else{
                num=0;
            }
            curr1=curr1.next;
            curr2=curr2.next;
            runner= runner.next;
        }
        ListNode rest;
        if(curr1 == null){
             rest = curr2;
        }else{
             rest= curr1;
        }
        while(rest!= null){
            num += rest.val;
            runner.next = new ListNode(num%10);
            if(num>=10){
                num=1;
            }else{
                num = 0;
            }
            rest = rest.next;
            runner=runner.next;
        }
        if(num==1) runner.next= new ListNode(1);
        return dummy.next;
    }
}
