class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=nums[0];
        int minsum=nums[0];
        int ans=nums[0];
        if(nums.length==1)
        return (int)Math.abs(nums[0]);
        else
        {
             for(int i=1;i<nums.length;i++)
        {
            maxsum=(int)Math.max(nums[i],nums[i]+maxsum);
            minsum=(int)Math.min(nums[i],nums[i]+minsum);
            ans=(int)Math.max(ans,(int)Math.max(Math.abs(maxsum),Math.abs(minsum)));
        }
        return ans;
        }
       
        
    }
}