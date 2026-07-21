class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                //swap the nums placed at mid and low
                //and increment both the mid and low
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }else if(nums[mid]==1)
            {
                //do nothing and traverse forward
                mid++;
            }else if(nums[mid]==2)
            {
                //swap the nums placed at mid and high
                //and decrement the high
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;

            }
        }
        
    }
}