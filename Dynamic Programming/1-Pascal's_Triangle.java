// Question Name : Pascal's Triangle
// Question URL : https://leetcode.com/problems/pascals-triangle/

import java.util.*;
class Solution 
{
    public List<List<Integer>> generate(int nr) 
    {
        List<List<Integer>> ar=new ArrayList<>();
        ArrayList<Pair> pairs=new ArrayList<>(); 
        for(int i=1;i<=nr;i++)
        {
            ar.add(new ArrayList<>());
        }
        ar.get(0).add(1);
        create(ar,1,pairs);
        return ar;
    }
    public static void create(List<List<Integer>> ar, int i, ArrayList<Pair> pairs)
    {
        if(ar.size()==i)
        return;
        int l=ar.get(i-1).size();
        int x=0,y=0;
        for(int j=0;j<l;j++)
        {
            if(j!=0)
            x=ar.get(i-1).get(j-1);
            y=ar.get(i-1).get(j);
            int xx=isPair(x,y,pairs);
            if(xx==-1)
            {
                pairs.add(new Pair(x,y,x+y));
                ar.get(i).add(x+y);
            }
            else
            {
                ar.get(i).add(xx);
            }
        }
        ar.get(i).add(1);
        create(ar,i+1,pairs);
    }
    public static int isPair(int n1, int n2, ArrayList<Pair> pairs)
    {
        int n=pairs.size();
        for(int i=0;i<n;i++)
        {
            Pair num=pairs.get(i);
            if( (num.num1==n1 && num.num2==n2) || (num.num1==n2 && num.num2==n1) )
            return num.result;
        }
        return -1;
    }
}
class Pair
{
    int num1;
    int num2;
    int result;
    Pair()
    {
        num1=0;
        num2=0;
        result=0;
    }
    Pair(int n1,int n2, int res)
    {
        num1=n1;
        num2=n2;
        result=res;
    }
}