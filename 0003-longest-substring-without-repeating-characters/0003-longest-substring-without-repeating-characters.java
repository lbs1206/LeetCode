class Solution {
    public int lengthOfLongestSubstring(String s) {       
        int max = 0;
        
        for(int i = 0; i< s.length(); i ++){
            for(int j = i; j<=s.length(); j ++){
                String sub = s.substring(i, j);
                
                if(max >= sub.length()){
                    continue;
                }
                
                boolean chk = countChar(sub);
                
                if(chk && max < sub.length()){
                    max = sub.length();
                }
                
                if(max >= 95){
                    return max;
                }
                
            }
        }
        
        
        return max;
    }
    
     public static boolean countChar(String str) {
         char[] array = str.toCharArray();
         
         for(int i = 0; i < array.length; i ++){
             int count = 0;
             for(int j=0; j<str.length(); j ++){
                 if(str.charAt(j) == array[i]){
                     count ++;
                 }
             }
             if(count >= 2){
                 return false;
             }
         }
         
         return true;
     }

}