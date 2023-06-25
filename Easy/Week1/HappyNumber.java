package Week1;
//      https://leetcode.com/problems/happy-number/


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<Integer>();
             while(n!=1 && !set.contains(n)){
                 set.add(n);
                 n=getNext(n);
             }
             return n==1;
        }
        public int getNext(int n){
            int sum=0;
            while(n>0){
                int d = n%10;
                sum+=d*d;
                n=n/10;
            }
            return sum;
        }
    }
}


// TC = 0(logn)
// SC = 0(n)