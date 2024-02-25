// Question Name : Remove Duplicates from Sorted Array
// Question URL : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.*;
class Solution 
{
    public int removeDuplicates(int[] num) 
    {
        int l=num.length;
        ArrayList<Integer> set=new ArrayList<>(); 
        for(int i=0;i<l;i++)
        {
            if(!set.contains(num[i]))
            set.add(num[i]);
        }
        for(int i=0;i<set.size();i++)
        {
            num[i]=set.get(i);
        }
        return set.size();
    }
}
