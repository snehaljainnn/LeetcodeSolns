class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int currentsum=a[0];
        int finalsum=a[0];
        for(int i=1;i<a.length;i++)
        {
            currentsum=(int)Math.min(a[i],a[i]+currentsum);//
            finalsum=(int)Math.min(finalsum,currentsum);
        }
        return finalsum;
        
    }
}