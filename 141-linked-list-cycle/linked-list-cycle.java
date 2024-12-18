/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastHead = head;

        while(fastHead != null && fastHead.next != null){
            head = head.next;
            fastHead = fastHead.next.next;
            
            if(head == fastHead){
                return true;
            }
        }
        return false;
        
    }
}