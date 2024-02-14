// Question Name : Find the Town Judge
// Question URL : https://leetcode.com/problems/find-the-town-judge/

class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)
            if(trust.length==1)
            return trust[0][1];
            else
            return 1;
        int arr[][]=new int[n][2];
        int l=trust.length;
        int num=-1;
        for(int i=0;i<l;i++)
        {
            arr[ trust[i][1]-1 ][ 0 ]++; // trusted by
            arr[ trust[i][0]-1 ][ 1 ]++; // trusting someone
            if(arr[ trust[i][1]-1 ][ 0 ] == n-1)
            {
                num=i;
            }
        }
        if(num==-1)
            return -1;
        else if( arr[ trust[num][1]-1 ][ 1 ] !=0 )
            return -1;
        return trust[num][1];
    }
}