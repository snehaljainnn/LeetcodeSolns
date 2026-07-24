class Solution {
    public int characterReplacement(String s, int k) {
        int a[]=new int[26];
        int high=0,low=0;
        int maxcount=0;//for like storing the max frequency of the most occuring element
        int maxlen=0;//for storing the length of the longest substring

        for(high=0;high<s.length();high++)
        {
            char ch=s.charAt(high);
            int p=++a[ch-'A'];//give me the frequency at the index of the triggered alphabet
            maxcount=(int)Math.max(p,maxcount);
            //im finding the max of the frequencies.jo current element ki hai and overall array me hai
            int len=high-low+1;//the size of window
            int diff=len-maxcount;
            if(diff>k)
            {
                char chi=s.charAt(low);
                --a[chi-'A'];
                low++;
            }
            //after moving the window
            len=high-low+1;
            maxlen=(int)Math.max(maxlen,len);//now out of the length of longest substing and the leftover window size,find the max

        }
        return maxlen;

        
    }
}