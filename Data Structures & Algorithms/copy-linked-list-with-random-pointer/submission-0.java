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

        Node curr = head;
        Map<Node,Node> OldtoNew = new HashMap<>();

        OldtoNew.put(null,null);

        while(curr != null){

            Node copy = new Node(curr.val);
            OldtoNew.put(curr,copy);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){

            Node copy = OldtoNew.get(curr);
            copy.next = OldtoNew.get(curr.next);
            copy.random = OldtoNew.get(curr.random);
            curr = curr.next;
        }

        return OldtoNew.get(head);

    
        
        
    }
}
