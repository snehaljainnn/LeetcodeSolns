class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxa=nums[0];
        int minb=nums[0];
        int finala=nums[0];
        int finalb=nums[0];
        int i=1;
        while(i%nums.length!=0)
        {
            maxa=(int)Math.max(nums[i],nums[i]+maxa);
            finala=(int)Math.max(finala,maxa);
            minb=(int)Math.min(nums[i],nums[i]+minb);
            finalb=(int)Math.min(finalb,minb);
            i++;

        }
        int sum=Arrays.stream(nums).sum();
        if(finala<0)//means the sum of the whole array is negative then
        {
            return finala;
        }
        else{
            int finalB=sum-finalb;
        int finalans=(int)Math.max(finalB,finala);
        return finalans;
        }

    }
}