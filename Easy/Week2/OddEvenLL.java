public class OddEvenLL {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head == null) return null;
            
            ListNode odd = head;
            ListNode even = head.next;
            ListNode temp = even;
    
            while(even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
    
            odd.next = temp;
            return head;
        }
    }
}
