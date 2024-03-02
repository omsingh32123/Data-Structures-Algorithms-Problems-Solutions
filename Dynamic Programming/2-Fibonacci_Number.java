// Question Name : Fibonacci Number
// Question URL : https://leetcode.com/problems/fibonacci-number/

import java.util.*;
class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int num=fibo(n,map);
        return num;
    }
    public int fibo(int n, HashMap<Integer, Integer> map) {
        if(map.containsKey(n))
        return map.get(n);
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        int num = fibo(n-2,map)+fibo(n-1,map);
        map.put(n,num);
        return num;
    }
}

// Non-DP approach || Simple Recursion approach
class Solution2 {
    public int fib(int n) {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        return fib(n-2)+fib(n-1);
    }
}