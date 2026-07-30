class Solution {
    public int maxProduct(int[] nums) {
        int maxp=nums[0];
        int minp=nums[0];
        int fp=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int v1=nums[i];
            int v2=nums[i]*minp;
            int v3=nums[i]*maxp;
            maxp=(int)Math.max(v1,(int)Math.max(v2,v3));
            minp=(int)Math.min(v1,(int)Math.min(v2,v3));

            fp=(int)Math.max(fp,(int)Math.max(maxp,minp));
        }
        return fp;
        
    }
}