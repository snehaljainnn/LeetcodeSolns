class Solution {
    void segregate0and1(int[] arr) {
        int mid=0,high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==1)
            {
                //swapping a[mid] and a[high]
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }else if(arr[mid]==0)
            {
                mid++;
            }
        }
        
    }
}
