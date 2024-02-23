// Question Name : Minimum Genetic Mutation
// Question URL : https://leetcode.com/problems/minimum-genetic-mutation/

import java.util.*;
class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        ArrayList<String> list=new ArrayList<>();
        int min[]={Integer.MAX_VALUE};
        int l=bank.length;
        for(int i=0;i<l;i++)
        {
            list.add(bank[i]);
        }
        findNumber(startGene,endGene,list,0,min);
        if(min[0]==Integer.MAX_VALUE)
        return -1;
        return min[0];
    }
    public static void findNumber(String sg, String eg, ArrayList<String> list, int count, int min[])
    {
        for(int i=0;i<list.size();i++)
        {
            String x=list.get(i);
            if(difference(sg,x)==1)
            {
                if(x.equals(eg))
                {
                    if( min[0] > count+1 )
                    min[0] = count+1;
                }
                list.remove(x);
                findNumber(x,eg,list,count+1,min);
                list.add(x);
            }
        }
    }
    public static int difference(String a, String b)
    {
        int diff=0;
        for(int i=0;i<8;i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                diff++;
            }
            if(diff>1)
            break;
        }
        return diff;
    }
}

