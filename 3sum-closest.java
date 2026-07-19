class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        //this nums array is sorted in nlogn time
        int mindiff=Integer.MAX_VALUE;
        int sum=0;
        int result=0;

        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1,right=nums.length-1;
            // int sum=a[left]+a[right]+a[i];
            // int diff=Math.abs(sum-target);

            // if mindiff > diff:
            //mindiff = diff
            //         result = total

            while(left<right)
            {
               sum=nums[left]+nums[right]+nums[i];
               int diff=Math.abs(sum-target);
               if(diff<mindiff)
                    {
                        mindiff=diff;
                        result=sum;
                    }
                if(sum>target)
                {
                    right--;
                    
                }
                else if(sum<target)
                {
                    left++;
                }else if(sum==target)
                {
                    // diff=0;
                    break;
                    // return result;

                }
            }

        }
        return result;
        
    }
}