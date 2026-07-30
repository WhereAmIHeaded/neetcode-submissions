/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node curr = head;
        Node dummy = new Node(0);
        Node runner = dummy;
        HashMap<Node, Integer> indexGetter = new HashMap<>();
        ArrayList<Node> newLL = new ArrayList<>();
        int counter= 0;
        indexGetter.put(null,-1);
        while(curr!=null){
            indexGetter.put(curr, counter);
            Node temp = new Node(curr.val);
            runner.next= temp;
            newLL.add(temp);
            counter++;
            runner = runner.next;
            curr=curr.next;
        }
        //assign random
        curr= head;
        runner= dummy.next;
        while(curr!=null){
            int index = indexGetter.get(curr.random);
            if(index==-1){
                runner.random=null;
            }else{
            runner.random= newLL.get(index);
            }
            curr= curr.next;
            runner=runner.next;
        }
        return dummy.next;
    }
}
