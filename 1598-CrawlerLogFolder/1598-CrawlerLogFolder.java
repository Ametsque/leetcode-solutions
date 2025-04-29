// Last updated: 29/04/2025, 18:45:13
class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String s : logs){
            if (s.equals("../")){
                if (count != 0){
                    count--;
                }
            } else if (!s.equals("./")){
                count++;
            }
        }
        return count;
    }
}