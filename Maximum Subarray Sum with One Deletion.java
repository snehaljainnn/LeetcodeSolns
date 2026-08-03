class Solution {
    public int maximumSum(int[] arr) {
        int nodlt=arr[0];
        int withdlt=-1234567890;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int prevnodlt=nodlt;
            nodlt=(int)Math.max(arr[i],arr[i]+nodlt);
            // int v;
            // if(withdlt==Integer.MIN_VALUE)
            // v=prevnodlt;
            // else
            // v=withdlt+arr[i];

            withdlt=(int)Math.max(prevnodlt,withdlt+arr[i]);
            ans=(int)Math.max(ans,(int)Math.max(nodlt,withdlt));
        }
        return ans;

        
    }
}