// Question Name : Rod Cutting
// Question URL : https://www.geeksforgeeks.org/problems/rod-cutting0840/1

class Solution{
    public int cutRod(int price[], int n) {
        
        for(int i=0;i<n;i++)
        {
            int a=0,b=i-1,max=0;
            while(a<=b)
            {
                if(price[a]+price[b]>max)
                    max=price[a]+price[b];
                a++;
                b--;
            }
            if(max>price[i])
            price[i]=max;
        }
        return price[n-1];
    }
}
