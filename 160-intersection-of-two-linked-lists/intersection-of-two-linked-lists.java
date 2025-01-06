/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        Set<ListNode> set = new HashSet<>();

        while(nodeA != null && nodeB != null){
            if(set.contains(nodeA)){
                return nodeA;
            }
             set.add(nodeA);
             
            if(set.contains(nodeB)){
                return nodeB;
            }
            set.add(nodeB);

            nodeA = nodeA.next;
            nodeB = nodeB.next;

        }

        while(nodeA != null){
            if(set.contains(nodeA)){
                return nodeA;
            }
            nodeA = nodeA.next;
        }
        while(nodeB != null){
            if(set.contains(nodeB)){
                return nodeB;
            }
            nodeB = nodeB.next;
        }



        return null;
    }
}