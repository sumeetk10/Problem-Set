package Leetcode_Daily.OctWeek1;
class Solution {
    public String reverseWords(String s) {
        
       String[] word = s.split(" ");

       for(int i=0; i<word.length; i++) {
           word[i] = new StringBuilder(word[i]).reverse().toString();
       }

       return String.join(" ",word);
    }
}