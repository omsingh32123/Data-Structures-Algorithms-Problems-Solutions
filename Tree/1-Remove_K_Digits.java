import java.util.*;
class Solution {
    public String removeKdigits(String s, int k) {
        if(k==0)
        return s;
        if((k==1 && s.length()==1)  || k==s.length() )
        return "0";
        Stack<Character> stack = new Stack<>();
        s=s+'9';
        char[] charArray = s.toCharArray();
        int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            char ch1 = charArray[i];
            char ch2 = charArray[i+1];
            if( stack.isEmpty()==false && ch1<stack.peek() )
            {
                while( stack.isEmpty()==false && k>0 && ch1<stack.peek())
                {
                    k--;
                    stack.pop();
                }
            }
            if(ch1<=ch2)
            {
                if( stack.isEmpty()==false || (stack.isEmpty() && ch1!='0'))
                stack.push(ch1);
            }
            else
            {
                if(k>0)
                {
                    k--;
                }
                else
                {
                    if( stack.isEmpty()==false || (stack.isEmpty() && ch1!='0') )
                    stack.push(ch1);
                }
            }
        }
        if(k<0)
        k=0;
        for (int i = 0; i < k && (stack.isEmpty())==false ; i++) 
        {
            stack.pop();
        }
        if(stack.isEmpty())
        {
            stack.push('0');
        }
        String t="";
        for (int i = 0; i < stack.size(); i++) {
            char element = stack.get(i);
            t = t + element;
        }
        return t;
    }
}