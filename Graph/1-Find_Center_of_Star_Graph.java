// Question Name : Find Center of Star Graph
// Question URL : https://leetcode.com/problems/find-center-of-star-graph/description/

class Solution {
    public int findCenter(int[][] edges) {
        int i=edges[0][0];
        int j=edges[0][1];
        if( i==edges[1][1] || i==edges[1][0] )
            return i;
        return j;
    }
}