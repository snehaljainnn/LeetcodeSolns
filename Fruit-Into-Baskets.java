import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int low=0,high=0;
        int maxlen=-1;
        for(high=0;high<fruits.length;high++)
        {
            h.put(fruits[high],h.getOrDefault(fruits[high],0)+1);
            while(h.size()>2)
            {
                int n=fruits[low];
                h.put(n,h.get(n)-1);

                if(h.get(n)==0)
                {
                    h.remove(n);
                }
                low++;
            }
            int len=high-low+1;
            maxlen=(int)Math.max(maxlen,len);
        }
        return maxlen;
        
    }
}