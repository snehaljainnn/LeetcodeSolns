import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int low=0,high=0;
        int maxlen=0;

        for(high=0;high<s.length();high++)
        {
            char currchar=s.charAt(high);
            h.put(currchar,h.getOrDefault(currchar,0)+1);

            while(h.get(currchar)>1)
            {
                
                char ch=s.charAt(low);
                h.put(ch,h.get(ch)-1);
                if(h.get(ch)==0)
                {
                    h.remove(ch);
                }
                low++;
            }
               int len=high-low+1;
                maxlen=(int)Math.max(maxlen,len);
 }
        return maxlen;
        
    }
}