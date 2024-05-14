// Question Name : Largest Local Values in a Matrix
// Question URL : https://leetcode.com/problems/largest-local-values-in-a-matrix/

class Solution {
    public int[][] largestLocal(int[][] ar) {
        int maxLocal[][] = new int[ar.length-2][ar.length-2];
        for( int i=1 ; i<ar.length-1 ; i++ )
        {
            for( int j=1 ; j<ar.length-1 ; j++ )
            {
                int max=Math.max(ar[i-1][j-1],ar[i-1][j]);
                max=Math.max(max,ar[i-1][j+1]);
                max=Math.max(max,ar[i][j-1]);
                max=Math.max(max,ar[i][j]);
                max=Math.max(max,ar[i][j+1]);
                max=Math.max(max,ar[i+1][j-1]);
                max=Math.max(max,ar[i+1][j]);
                max=Math.max(max,ar[i+1][j+1]);
                maxLocal[i-1][j-1]=max;
            }
        }
        return maxLocal;
    }
}