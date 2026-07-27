class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high=0,low=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        int t=0;
        for(high=0;high<nums.length;high++)
        {
            sum=sum+nums[high];
            while(sum>=target)//you reach here when the info is right
            {
                int c=high-low+1;
                minlen=(int)Math.min(minlen,c);
                sum=sum-nums[low];
                low++;
                t++;
            }
            //you reach here now when the info is wrong again
        }
        if(t==0)
        return 0;
        else
        return minlen;
    }
}