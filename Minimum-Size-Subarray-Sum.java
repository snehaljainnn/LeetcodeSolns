class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int t=0;
        int low=0,high=0,sum=0;
        while(high<nums.length)
        {
            sum=sum+nums[high];//hiring the later index elements
            
            while(sum>=target)//firing the starting index elements
            {
                int len=high-low+1;
                res=(int)Math.min(res,len);
                sum=sum-nums[low];
                low++;
                t++;
            }
            high++;

        }
        if(t==0)
        return 0;
        else
        return res;
        
    }
}