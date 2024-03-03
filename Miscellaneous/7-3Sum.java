// Question Name : 3Sum
// Question URL : https://leetcode.com/problems/3sum/description/

// Approach 1
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


// Approach 2 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outerList=new ArrayList<>();
        List<Integer> numList=new ArrayList<>();
        HashSet<Integer> usedList=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            numList.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if( !(usedList.contains(nums[i]) && usedList.contains(nums[j]) && usedList.contains((nums[i]+nums[j])*-1)) && numList.contains((nums[i]+nums[j])*-1) ) // check usedList
                {
                    List<Integer> innerList=new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add((nums[i]+nums[j])*-1);
                    usedList.add(nums[i]);
                    usedList.add(nums[j]);
                    usedList.add((nums[i]+nums[j])*-1);
                    outerList.add(innerList);
                }
            }
        }
        return outerList;
    }
}