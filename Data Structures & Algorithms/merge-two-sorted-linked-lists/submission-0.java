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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy = new ListNode(0,list2);
        ListNode senital = dummy;
        ListNode nextNode;
        while(list1!=null){
            if(list1.val<=list2.val){
                nextNode=list1.next;
                dummy.next=list1;
                list1.next=list2;
                dummy=list1;
                list1=nextNode;
            }else{
                dummy=list2;
                if(list2.next==null){
                    list2.next=list1;
                    break;
                }
                list2=list2.next;
            }
        }
        return senital.next;


    }
}