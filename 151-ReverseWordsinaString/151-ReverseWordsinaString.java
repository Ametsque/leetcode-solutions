// Last updated: 29/04/2025, 13:49:53
class Solution {
    public String reverseWords(String s) {
        ArrayList<String> wordList = new ArrayList<>();
        int fp = 0;
        boolean fpFound = false;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ' && !fpFound){
                fpFound = true;
                fp = i;
            } else if (s.charAt(i) == ' '){
                if (fpFound){
                   wordList.add(s.substring(fp,i)); 
                }
                fpFound = false;
            }
        }

        if (fpFound) {
            wordList.add(s.substring(fp, s.length()));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = wordList.size()-1; i >= 0; i--){
            sb.append(wordList.get(i));
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}