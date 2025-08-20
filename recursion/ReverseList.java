class ReverseList {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    
    ListNode reverse(ListNode current, ListNode previous) {
        if(current == null) {
            return previous; // return the new head
        }
        
        ListNode temp = current.next; // next node
        current.next = previous; // next node will be previous now
        previous = current; // previous becomes the current
        
        return reverse(temp, previous);
    }
}
