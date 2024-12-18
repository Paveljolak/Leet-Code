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
        ListNode ans = new ListNode();
        ListNode ansTail = ans;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ansTail.next = list1;
                list1 = list1.next;
                ansTail = ansTail.next;
            }else{
                ansTail.next = list2;
                list2 = list2.next;
                ansTail = ansTail.next;
            }
        }
        if(list1 != null){
            ansTail.next = list1;
        }else{
            ansTail.next = list2;
        }
        return ans.next;
    }
}