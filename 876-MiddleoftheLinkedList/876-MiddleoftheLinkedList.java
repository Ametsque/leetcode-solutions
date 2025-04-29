// Last updated: 29/04/2025, 18:36:16
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
    private int sizeOfList(ListNode head){
        int count = 1;
        ListNode newHead = head.next;
        if (newHead == null){
            return count;
        } else {
            count += sizeOfList(newHead);
            return count;
        }
    }

    public ListNode middleNode(ListNode head) {
        int size = sizeOfList(head);
        int middleIndex = (int) Math.floor(size/2);
        for (int i = 0; i < middleIndex; i++){
            head = head.next;
        }
        return head;
    }
}