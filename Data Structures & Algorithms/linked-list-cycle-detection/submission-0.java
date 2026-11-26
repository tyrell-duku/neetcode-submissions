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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode ptr = head;
        while (ptr != null) {
            if (visited.contains(ptr)) {
                return true;
            }
            visited.add(ptr);
            ptr = ptr.next;
        }
        return false; 
    }
}
