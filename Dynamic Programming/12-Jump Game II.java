// Question Name :  Jump Game II
// Question URL : https://leetcode.com/problems/jump-game-ii/

class Solution {
    public int jump(int[] num) {
        int n=num.length;
        int dist[]=new int[n];
        dist[n-1]=0;
        for( int i=n-2 ; i>=0 ; i-- )
        {
            if(num[i]==0)
            {
                dist[i]=2000;
                continue;
            }
            int index1=i+num[i];
            if(index1>=n)
            index1=n-1;
            int min=1+dist[index1];
            for(int j=i+1; j<=i+num[i] && j<n ;j++)
            {
                if(1+dist[j]<min)
                min=1+dist[j];
            }
            dist[i]=min;
        }
        return dist[0];
    }
}