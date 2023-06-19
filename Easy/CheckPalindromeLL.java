import org.w3c.dom.Node;

public class CheckPalindromeLL {
    class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null) return false;
        if( head.next == null) return true;
        
        int copy = 0;
        int reverse = 0;
        
        while(head != null) {
            copy = copy*10 + head.data;
            head = head.next;
        }
        
        int temp = copy;
        
        while(copy > 0) {
            int remainder = copy%10;
            reverse = reverse*10 + remainder;
            copy = copy/10;
        }
        
        if(reverse == temp) return true;

        return false;
    }    
}


}
