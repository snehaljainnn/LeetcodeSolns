class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        int ans=0;
        while(true)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast)
            {
                //means we have reached the meeting point
                //set slow to head
                slow=0;
                while(slow!=fast)
                {
                    slow=nums[slow];
                    fast=nums[fast];
                }
                //you reach here at the end of the loop
                ans=slow;
                break;
            }
        }
        return slow;
        
    }
}