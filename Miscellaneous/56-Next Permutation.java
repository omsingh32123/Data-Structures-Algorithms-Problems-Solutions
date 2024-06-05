// Question Name :  Next Permutation
// Question URL : https://leetcode.com/problems/next-permutation/description/

import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int j=0,fl=0;
        ArrayList<Integer> list=new ArrayList<>();
        for( int i=nums.length-1 ; i>0 ; i-- )
        {
            list.add(nums[i]);
            if( nums[i]>nums[i-1] )
            {
                fl=1;
                int t = nums[i-1];
                nums[i-1] = nextGreater(list,t);
                list.add(t);
                j=i;
                break;
            }
        }
        if(fl==0)
        Arrays.sort(nums);
        else
        appendListToArray(list,nums,j);
    }
    public static void appendListToArray(ArrayList<Integer> list,int[] nums,int j)
    {
        Collections.sort(list);
        int k=0;
        for( int i=j ; i<nums.length ; i++ )
        {
            nums[i]=list.get(k);
            k++;
        }
    }
    public static int nextGreater(ArrayList<Integer> list, int t)
    {
        Collections.sort(list);
        for( int i=0 ; i<list.size() ; i++ )
        {
            if( list.get(i)>t )
            {
                int cc=list.get(i);
                list.remove(i);
                return cc;
            }
            
        }
        return t;
    }
}