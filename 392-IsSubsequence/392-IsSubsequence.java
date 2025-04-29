// Last updated: 29/04/2025, 14:42:24
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.isEmpty() && !s.isEmpty()){
            return false;
        }
        char[] sArray;
        char[] lArray;
        sArray = s.toCharArray();
        lArray = t.toCharArray();
        
        int prevIndex = -1;
        for (char sChar : sArray){
            boolean charFound = false;
            for (int i = 0; i < lArray.length; i++){
                if (sChar == lArray[i]){
                    if (prevIndex >= i){
                        continue;
                    } else {
                        prevIndex = i;
                        charFound = true;
                        break;
                    }                 
                }
            }
            if (!charFound){
                return false;
            }
        }
        return true;
    }
}