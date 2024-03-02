// Question Name : 3Sum
// Question URL : https://leetcode.com/problems/3sum/description/

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l2=new ArrayList<>();
        HashSet<String> checklist=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> l1=new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[k]);
                        Collections.sort(l1);
                        if(!checklist.contains(l1.get(0)+" "+l1.get(1)+" "+l1.get(2)))
                        {
                            checklist.add(l1.get(0)+" "+l1.get(1)+" "+l1.get(2));
                            l2.add(l1);
                        }
                    }
                }
            }
        }
        return l2;
    }
}