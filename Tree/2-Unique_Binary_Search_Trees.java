// Question Name :  Unique Binary Search Trees
// Question URL : https://leetcode.com/problems/unique-binary-search-trees/description/

class Solution {
    public int numTrees(int n) {
        int array[] = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        for(int i=2;i<=n;i++){
            int x=0;
            int y = i-1;
            int sum=0;
            while(x<i&&y>=0) {
                sum+=array[x]*array[y];
                x++;
                y--;
            }
            array[i] = sum;
        }
        return array[n];
    }
}