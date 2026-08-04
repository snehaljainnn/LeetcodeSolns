class Solution {
    public int pivotIndex(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        int left=0;
        int ind=0;
        //what if nums[0]is the pivot
        int rsum=nums[0]-sum;
        if(rsum==0)
        return 0;//means the first element is the pivot
        else
        {
            for(int i=1;i<nums.length;i++)
        {
            left=left+nums[i-1];
            int right=sum-nums[i]-left;
            if(left==right)
            {
                ind=i;
                break;

            }
        }
        if(ind==0)
        return -1;
        else
        return ind;
        }
        
    }
}