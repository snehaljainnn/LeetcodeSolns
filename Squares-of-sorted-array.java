class Solution {
    public int[] sortedSquares(int[] nums) {
        int cn=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            cn++;
        }
        int a[]=new int[cn];
        int d= nums.length-cn;
        int b[]=new int[d];
        int ind1=0,ind2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                a[ind1++]=nums[i];//this a array has negative values

            }else
            {
                b[ind2++]=nums[i];//this b array has positive values

            }
        }
        for(int i=0;i<a.length;i++)
        a[i]=a[i]*a[i];//sqaring negative elements but this array is rn in descendind order

        //i need to reverse this a array
        int a1[]=new int[a.length];
        int k=0;
        for(int i=a.length-1;i>=0;i--)
        {
            a1[k++]=a[i];

        }

        for(int i=0;i<b.length;i++)
        b[i]=b[i]*b[i];//squaring positive elements also this array is alr sorted in ascending order

        int aind=0,bind=0;
        int j=0;

        while(aind<a1.length && bind<b.length)
        {
            if(a1[aind]<b[bind])
            {
                nums[j++]=a1[aind++];

            }else if(a1[aind]>b[bind])
            {
                nums[j++]=b[bind++];
            }
            else if(a1[aind]==b[bind])
            {
                nums[j++]=b[bind++];
                
            }
        }
        while(aind<a.length){
            nums[j++]=a1[aind++];
        }
        while(bind<b.length){
            nums[j++]=b[bind++];
        }
        return nums;


        
    }
}