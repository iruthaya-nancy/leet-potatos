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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //we are going to rearrange not modify the head or build new listnode
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; //storing the even head for appending.
        while(even != null && even.next != null){
            odd.next = even.next;
            //move next node
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        //append node
        odd.next = evenHead;
        return head;
    }
}