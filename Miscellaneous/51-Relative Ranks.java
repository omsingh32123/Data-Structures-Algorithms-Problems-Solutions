// Question Name : Relative Ranks
// Question URL : https://leetcode.com/problems/relative-ranks/

import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=score.length;
        for(int i=0;i<n;i++)
        {
            list.add(score[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        String ar[]=new String[n];
        for(int i=0;i<n;i++)
        {
            int index=indexOfArray(score,  list.get(i));
            if(i==0)
            ar[index]="Gold Medal";
            else if(i==1)
            ar[index]="Silver Medal";
            else if(i==2)
            ar[index]="Bronze Medal";
            else
            ar[index]=""+(i+1);
        }
        return ar;
    }
    public static int indexOfArray(int ar[], int n)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==n)
            return i;
        }
        return -1;
    }
}