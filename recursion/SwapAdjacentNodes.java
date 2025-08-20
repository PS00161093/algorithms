// https://leetcode.com/problems/swap-nodes-in-pairs/

class SwapAdjacentNodes {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode n1 = head; // First node of current pair
        ListNode n2 = head.next; // Second node of current pair

        n1.next = swapPairs(n2.next); // Recursively process remaining pairs
        n2.next = n1; // Connect second node to first

        return n2; // Return new head of this pair
    }
 
}
