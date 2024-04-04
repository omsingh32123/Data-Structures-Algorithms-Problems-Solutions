// Question Name : Maximum Nesting Depth of the Parentheses
// Question URL : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {
        int c=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                c++;
            }
            else if(s.charAt(i)==')')
            {
                c--;
            }
            if(c>max)
            max=c;
        }
        return max;
    }
}