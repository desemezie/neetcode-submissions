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
    public void reorderList(ListNode head) {

        if (head == null){
            return ;
        }

        ListNode curr = head;
        List<ListNode> Nodes = new ArrayList<>();

        while(curr != null){
            Nodes.add(curr);
            curr = curr.next;
        }

        int i = 0;
        int j = Nodes.size() - 1;

        while(i < j){
            
            Nodes.get(i).next = Nodes.get(j);
            i ++;
            
            if(i >= j){
                break;
            }

            Nodes.get(j).next = Nodes.get(i);
            j --;
        }

        Nodes.get(i).next = null;

        
    }
}
