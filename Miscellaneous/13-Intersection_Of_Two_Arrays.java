// Question Name : Intersection of Two Arrays
// Question URL : https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        int l1=nums1.length;
        int l2=nums2.length;
        for(int i=0;i<l1;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<l2;i++)
        {
            if(set.contains(nums2[i]))
            {
                arr.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int l=arr.size();
        int ar[]=new int[l];
        for(int i=0;i<l;i++)
        {
            ar[i]=arr.get(i);
        }
        return ar;
    }
}