// Last updated: 29/04/2025, 13:27:25
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> decodeMap = new HashMap<>();
        char currChar = 'a';
        for (char c : key.toCharArray()) {
            if (currChar > 'z') {
                break;
            }
            if (!decodeMap.containsKey(c) && c != ' ') {
                decodeMap.put(c, currChar++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: message.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
                continue;
            }
            sb.append(decodeMap.get(c));
        }

        return sb.toString();
    }
}