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
        ListNode ans = null;
        ListNode temp = ans;
        int rem = 0;
        int sum = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val;
            if (temp == null) {
                ans = new ListNode(sum % 10);
                temp = new ListNode(sum % 10);
                rem = sum / 10;
            } else {
                sum += rem;
                rem = sum / 10; 
                temp.next = new ListNode(sum%10);
            }
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
            if (rem > 0) {
                temp.next = new ListNode(rem);
            }            
        }
        return ans;
    }
}