class Solution {
    // public int sum(int n)
    // {
    //     int sumr=0;
    //     while(n>0)
    //     {
    //         int d=n%10;
    //         sumr=sumr+d*d;
    //         n=n/10;

    //     }
    //     return sumr;
    // }
    public boolean isHappy(int n) {
        // //method 1:
        // boolean ans=true;
        // int slow=n,fast=n;
        // while(fast!=1)
        // {
        //     slow=sum(slow);//ek baar sum calculate karo
        //     fast=sum(fast);//do step me karo
        //     fast=sum(fast);
        //     if(slow==fast && slow!=1)//means cycle is detected
        //     {
        //         ans=false;
        //         break;
        //     }
        // }
        // return ans;

        //method 2:

        while(n>9)
        {
            int t=n;
            int sum=0;
            while(t>0)
            {
                int d=t%10;
                sum=sum+(d*d);
                t=t/10;

            }
            n=sum;
        }
        if(n==1 || n==7)
        return true;
        else
        return false;
        
    }
}