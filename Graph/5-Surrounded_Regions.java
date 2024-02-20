// Question Name : Surrounded Regions
// Question URL : https://leetcode.com/problems/surrounded-regions/description/


import java.util.*;
class Solution {
    public void solve(char[][] board) 
    {
        int m=board.length;
        int n=board[0].length;
        char board2[][] = new char[m][n]; 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board2[i][j]=board[i][j];
                board[i][j]='X';
            }
        }
        ArrayList<String> srr=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            int addj = (i==0||i==m-1) ? 1 : n-1 ;
            for(int j=0;j<n;j+=addj)
            {
                if( board2[i][j]=='O' && !srr.contains(i+" "+j) )
                {
                    capture(board,i,j,m,n,board2,srr);
                }
            }
        }
    }
    public static void capture(char[][] board, int i, int j, int m, int n, char board2[][], ArrayList<String> srr )
    {
        srr.add(i+" "+j);
        board[i][j]='O';
        if( j<n-1 && board2[i][j+1]=='O' && !srr.contains(i+" "+(j+1)) )
        {
            capture(board,i,j+1,m,n,board2,srr);
        }
        if( j>0 && board2[i][j-1]=='O' && !srr.contains(i+" "+(j-1)) )
        {
            capture(board,i,j-1,m,n,board2,srr);
        }
        if( i<m-1 && board2[i+1][j]=='O' && !srr.contains((i+1)+" "+j) )
        {
            capture(board,i+1,j,m,n,board2,srr);
        }
        if( i>0 && board2[i-1][j]=='O' && !srr.contains((i-1)+" "+j) )
        {
            capture(board,i-1,j,m,n,board2,srr);
        }
    }
}