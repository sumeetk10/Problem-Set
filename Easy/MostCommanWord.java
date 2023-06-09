//      https://leetcode.com/problems/most-common-word/description/

public class MostCommanWord {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            
            paragraph = paragraph.https://leetcode.com/problems/most-common-word/description/.toLowerCase();
        
            String[] para =   paragraph.split(" ");
        
            HashMap<String,Integer> hMap = new HashMap();
        
        for(int i = 0;i<para.length;i++)
        {
            if(para[i] == "")
                continue;
            
            if(!hMap.containsKey(para[i]))
                hMap.put(para[i],1);
            else
                hMap.put(para[i],hMap.get(para[i])+1);
        }
        
        
        for(int j=0;j<banned.length;j++)
        {
            if(hMap.containsKey(banned[j]))
                hMap.remove(banned[j]);
        }
            
       Set<Map.Entry<String,Integer>> entrySet =  hMap.entrySet();
        Integer max = 0;
        String repeat = "";
        for(Map.Entry<String,Integer> m : entrySet)
        {
            if(max < m.getValue())
            {
                max = m.getValue();
                repeat = m.getKey();
            }
        }
        
        return repeat;
    
        }
    }
}
