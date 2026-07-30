class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int finalsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentsum=(int)Math.max(nums[i],nums[i]+currentsum);//
            finalsum=(int)Math.max(finalsum,currentsum);
        }
        return finalsum;
        
    }
}