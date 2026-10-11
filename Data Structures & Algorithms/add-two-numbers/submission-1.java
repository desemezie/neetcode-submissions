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

        int v1 = l1.val;
        int v2 = l2.val;
        int carry = 0;
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1 != null ||l2 != null |carry != 0){
         
            
            v1 = (l1 != null) ? l1.val: 0;
            v2 = (l2 != null) ? l2.val: 0;
            System.out.print(v1);
            System.out.print(v2);
            System.out.print(carry);

            int value  = v1 + v2 + carry;
            int answer = value % 10;
            
            carry = ((value / 10 ) == 1) ? 1 : 0;
            // System.out.print(value);
            // System.out.print(carry);
            // System.out.print(carry);

            

            l1 = (l1 != null) ?l1.next :null;
            l2 =  (l2 != null) ?l2.next :null;

            // System.out.print(answer);
            // System.out.print(carry);

            //System.out.print(answer);
            ListNode newnode = new ListNode(answer);
            
            curr.next = newnode;
            curr = curr.next;
            
                     

        }
        return dummy.next;  
        
    }
}
