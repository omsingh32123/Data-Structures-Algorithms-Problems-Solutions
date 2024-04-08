// Question Name : Number of Students Unable to Eat Lunch
// Question URL : https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

import java.util.Stack;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>st=new Stack<>(); 
        Stack<Integer>st2=new Stack<>(); 
        for(int i=students.length-1;i>=0; i--)
        {
            st.push(students[i]);
        }
        int k=students.length;
        int c=0;
        for(int i=0;i<sandwiches.length;)
        {
            int y=sandwiches[i];
            int x=st.peek();
            if(x==y) 
            {
                i++;
                st.pop();
                c=0;
            }
            else
            {
                c++;
                int xx=st.pop();  
                while(!st.isEmpty())
                {
                    st2.push(st.pop());
                }
                st.push(xx);
                k=1;
                while(!st2.isEmpty())
                {
                    k++;
                    st.push(st2.pop());
                }
            }
            if(c==k)
            {
                return c;
            }
        }
        return 0;
    }
}