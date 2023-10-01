package Medium.Week1;

public class AddTwoLL {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode dummy = result;
            int sum = 0;
    
            while(l1 != null || l2 != null || sum != 0) {
                sum += (l1==null? 0 : l1.val) + (l2==null? 0 : l2.val);
    
                result.next = new ListNode(sum%10);
                sum = sum/10;
                result = result.next;
                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;
            }
    
            return dummy.next;
        }
    }
    
}
