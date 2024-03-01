// Question Name : Length of Last Word
// Question URL : https://leetcode.com/problems/length-of-last-word/

// Approach 1
class Solution {
    public int lengthOfLastWord(String s) {
        String sr[]=s.split(" ");
        int x=sr[sr.length-1].length();
        return x;
    }
}

// Approach 2
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int x=s.lastIndexOf(" ");
        return s.length()-x-1;
    }
}