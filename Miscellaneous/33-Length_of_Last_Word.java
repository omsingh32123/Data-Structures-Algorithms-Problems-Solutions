// Question Name : Length of Last Word
// Question URL : https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int x=s.lastIndexOf(" ");
        return s.length()-x-1;
    }
}