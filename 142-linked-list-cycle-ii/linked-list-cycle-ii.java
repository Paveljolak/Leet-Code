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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while(length > 0){
            second = second.next;
            length--;
        }

        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}