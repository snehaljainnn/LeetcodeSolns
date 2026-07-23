import java.util.*;
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> h=new HashMap<>();
        int low=0;
        int maxlen=-1;
        for(int high=0;high<s.length();high++)
        {
            char currentchar=s.charAt(high);
            //i have fetched the current char and now i will put it in hashmap
            h.put(currentchar,h.getOrDefault(currentchar,0)+1);
            //put this fetched character into hashmap at the alr existing value pair
            
            while(h.size()>k)
            {
                char ch=s.charAt(low);
                h.put(ch,h.get(ch)-1);
                
                if(h.get(ch)==0)
                {
                    h.remove(ch);
                }
                low++;
            }
            //after this while loop you will have a hashmap of k distinct elements
            if(h.size()==k)
            {
                //means the hashmap has k distinct elements
                int len=high-low+1;
                maxlen=(int)Math.max(maxlen,len);
                
            }
        }
        return maxlen;
    
    }
}