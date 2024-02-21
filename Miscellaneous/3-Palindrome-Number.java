// Question Name : Palindrome Number
// Question URL : https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        String s=x+"";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)!=s.charAt(l-1-i))
            return false;
        }
        return true;
    }
}