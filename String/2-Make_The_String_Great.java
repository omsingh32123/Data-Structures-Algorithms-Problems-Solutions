// Question Name : Make The String Great
// Question URL : https://leetcode.com/problems/make-the-string-great/

import java.util.Stack;
class Solution {
    public String makeGood(String s) {
        if(s.equals(""))
        return s;
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(i);
            if( !st.isEmpty() && Math.abs((int)st.peek()-(int)c) == 32 )
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        String t="";
        while(!st.isEmpty())
        {
            t=st.pop()+t;
        }
        return t;
    }
}