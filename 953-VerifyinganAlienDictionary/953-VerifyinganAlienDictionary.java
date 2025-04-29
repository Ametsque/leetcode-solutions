// Last updated: 29/04/2025, 18:37:02
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> orderMap = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            orderMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length-1; i++) {
            int bound = words[i].length();
            if (words[i].length() > words[i+1].length()){
                bound = words[i+1].length();
            }

            for (int j = 0; j < bound; j++) {
                if (orderMap.get(words[i].charAt(j)) > orderMap.get(words[i+1].charAt(j))) {
                    return false;
                } else if (orderMap.get(words[i].charAt(j)) < orderMap.get(words[i+1].charAt(j))) {
                    break;
                }
                if (j == bound-1 && bound != words[i].length()) {
                    return false;
                }
            }
        }

        return true;
    }
}