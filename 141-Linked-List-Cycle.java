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
        ListNode i = head;
        ListNode j = head;

        do{
            if(j == null || j.next == null)
                return false;
            i = i.next;
            j = j.next.next;
        }while(i!=j);
        
        return true;
    }
}