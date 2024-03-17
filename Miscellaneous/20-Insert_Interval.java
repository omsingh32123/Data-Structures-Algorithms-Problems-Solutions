// Question Name : Insert Interval
// Question URL : https://leetcode.com/problems/insert-interval/

import java.util.*;
class Solution {
    public static void main(String[] args) {
        int arrr[][]={{1,3},{6,9}};
        int brrr[]={2,5};
        insert(arrr,brrr);
    }
    public static int[][] insert(int[][] inter, int[] newinter) 
    {
        List<List<Integer>> ar=new ArrayList<>();
        int n=inter.length,c=0;
        for( int i=0 ; i<n ; i++ )
        {
            int x=0;
            if( newinter[0]<inter[i][0] && c==0 )
            {
                x=1;
                ar.add(new ArrayList<>());
                ar.get(ar.size()-1).add(newinter[0]);
                c=1;
            }
            if( newinter[1]>inter[i][1] && c==1 )
            {
                x=1;
                ar.get(ar.size()-1).add(newinter[1]);
                c=2;
            } 
            if(x==0)
            {
                ar.add(new ArrayList<>());
                ar.get(ar.size()-1).add(inter[i][0]);
                ar.get(ar.size()-1).add(inter[i][1]);
            }
        }
        int[][] arr = new int[ar.size()][2];
        for (int i = 0; i < ar.size(); i++)
        {
            arr[i][0] = ar.get(i).get(0);
            arr[i][1] = ar.get(i).get(1);
        }
        return arr;
    }
}