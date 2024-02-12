// Question Name : Find if Path Exists in Graph
// Question URL : https://leetcode.com/problems/find-if-path-exists-in-graph/

import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> edgeList = new ArrayList<>();
        convertArrayToList(edges, edgeList, n);
        return BFS(edgeList, source, destination);
    }
    public static boolean BFS(List<List<Integer>> edgeList, int src, int dest)
    {
        Queue<Integer> queue= new LinkedList();
        boolean vis[]=new boolean[edgeList.size()];
        queue.add(src);
        while(!queue.isEmpty())
        {
            int curr=queue.remove();
            if(curr==dest)
            {
                return true;
            }
            if(vis[curr]==false)
            {
                vis[curr]=true;
                for( int i=0 ; i<edgeList.get(curr).size() ; i++ )
                {
                    int e=edgeList.get(curr).get(i);
                    if(vis[e]==false)
                    {
                        queue.add(e);
                    }
                } 
            }
        }
        return false;
    }
    public static void convertArrayToList(int edges[][], List<List<Integer>> edgeList , int n)
    {
        for( int i=0 ; i<n ; i++ )
        {
            edgeList.add(new ArrayList<>());
        }
        for( int i=0 ; i<edges.length; i++ )
        {
            if( !edgeList.get(edges[i][0]).contains(edges[i][1]) )
            edgeList.get(edges[i][0]).add(edges[i][1]);
            if( !edgeList.get(edges[i][1]).contains(edges[i][0]) )
            edgeList.get(edges[i][1]).add(edges[i][0]);
        }
    }
}
class Edge
{
    int src;
    int dest;
    Edge()
    {
        src=0;
        dest=0;
    }
    Edge(int s, int d)
    {
        src=s;
        dest=d;
    }
}