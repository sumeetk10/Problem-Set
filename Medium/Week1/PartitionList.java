package Medium.Week1;

public class PartitionList {
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode first = new ListNode(0);
            ListNode f = first;
            ListNode second = new ListNode(0);
            ListNode s = second;
    
            while(head != null) {
                if(head.val < x){
                    f.next = head;
                    f = f.next;
                }
                else{
                    s.next = head;
                    s = s.next;
                }
                head = head.next;
    
            }
    
            f.next = second.next;
            s.next = null;
    
            return first.next;
        }
    }
}
