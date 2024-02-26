// Question Name : Length of Last Word
// Question URL : https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        String sr[]=s.split(" ");
        int x=sr[sr.length-1].length();
        return x;
    }
}