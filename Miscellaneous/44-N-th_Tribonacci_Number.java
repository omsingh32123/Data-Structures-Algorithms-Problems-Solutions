// Question Name : N-th Tribonacci Number
// Question URL : https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    public int tribonacci(int n) {
        if(n==0)
        return 0;
        if(n==1 || n==2)
        return 1;
        int a=0,b=1,c=1,i=3;
        while(i!=n)
        {
            int t=a;
            a=b;
            b=c;
            c=a+b+t;
            i++;
        }
        return a+b+c;
    }
}