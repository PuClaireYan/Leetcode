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

//hashset

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> store = new HashSet<>();
        while (head != null){
            if (store.contains(head)){
                return true;
            } else {
                store.add(head);     
            }
            head = head.next;
        }
        return false;
    }
}

// two points

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}