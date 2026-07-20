class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0,high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++)
        {
            sum=sum+arr[i];//sum of first window
        }
        int res=0;
        while(high<arr.length)
        {
            res=(int)Math.max(res,sum);
            low++;
            high++;//sliding the window
             
            if(high==arr.length)
            break;
            else
            {
                sum=sum+arr[high]-arr[low-1];
            }

        }
        return res;
        
    }
}