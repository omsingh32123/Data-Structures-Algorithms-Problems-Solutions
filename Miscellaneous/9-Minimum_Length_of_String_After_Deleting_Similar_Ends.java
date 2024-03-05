// Question Name : Minimum Length of String After Deleting Similar Ends
// Question URL : https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

import java.util.*;
class Solution {
    public int minimumLength(String s) {
        int sl=s.length();
        List<String> list=new ArrayList<>();
        String st=s.charAt(0)+"";
        s=s+" ";
        for( int i=1 ; i<=sl ; i++ )
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                st=st+s.charAt(i);
            }
            else
            {
                list.add(st);
                st=""+s.charAt(i);
            }
        }
        int l=list.size(),i=0,num=sl;
        if(l==1)
            if(list.get(0).length()==1)
            return 1;
            else
            return 0;
        while( list.get(i).charAt(0) == list.get(l-i-1).charAt(0) && i<l-i-1 )
        {
            num -= list.get(i).length() + list.get(l-i-1).length() ;
            i++;
        }
        if(i==l-i-1)
            if(list.get(i).length()==1)
            return 1;
            else
            return 0;
        return num;
    }
}