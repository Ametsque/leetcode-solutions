// Last updated: 29/04/2025, 18:52:09
class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        StringBuilder numSeq = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 96 && word.charAt(i) < 123) {
                if (numSeq.length() != 0) {
                    set.add(numSeq.toString());
                    numSeq.setLength(0);
                }
            } else {
                if (numSeq.length() != 0) {
                    if (numSeq.charAt(0) == '0') {
                        numSeq.setLength(0);
                    } 
                } 
                numSeq.append(word.charAt(i));
            }
        }

        if (numSeq.length() != 0) {
            set.add(numSeq.toString());
        }

        return set.size();
    }
}