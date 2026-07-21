class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        //the array is sorted
        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int left=i+1,right=arr.length-1;
            while(left<right)
            {
                if(arr[i]+arr[left]+arr[right]<sum)
                {
                    int t=right-left;
                    c=c+t;
                    left++;
                    // break;
                    
                }else if(arr[i]+arr[left]+arr[right]>sum)
                {
                    right--;
                }else if(arr[i]+arr[left]+arr[right]==sum)
                {
                    right--;
                    // left++;
                }
            }
        }
        return c;
        
        // code here
        
    }
}