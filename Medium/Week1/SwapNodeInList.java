package Medium.Week1;

public class SwapNodeInList {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            
            if(head == null || head.next == null) return head;
    
            ListNode curr = head;
            while(curr != null && curr.next != null) {
                int temp = curr.val;
                curr.val = curr.next.val;
                curr.next.val = temp;
    
                curr = curr.next.next;
            }
    
            return head;
        }
    }
}
