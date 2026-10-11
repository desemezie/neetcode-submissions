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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> Nodes = new ArrayList<>();

        ListNode curr = head;
        while(curr != null){
            Nodes.add(curr);
            curr = curr.next;
        }

        

        int RemoveIndex = Nodes.size() - n;
        
        if (RemoveIndex == 0){
            return head.next;
        }

        Nodes.get(RemoveIndex - 1).next = Nodes.get(RemoveIndex).next;

        return head;


    }
}
