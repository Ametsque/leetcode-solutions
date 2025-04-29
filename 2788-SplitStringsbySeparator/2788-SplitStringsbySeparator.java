// Last updated: 29/04/2025, 19:57:09
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (currentChar != separator) {
                    sb.append(currentChar);
                } else {
                    if (sb.length() == 0) {
                        continue;
                    }
                    stringList.add(sb.toString());
                    sb.setLength(0);
                }
            }
            if (sb.length() != 0) {
                stringList.add(sb.toString());
                sb.setLength(0);                
            }
        }

        return stringList;
    }
}