// Last updated: 29/04/2025, 18:48:33
class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            switch(command.charAt(i)) {
                case 'G':
                    sb.append('G');
                    break;
                case 'a':
                    sb.append("al");
                    i += 2;
                    break;
                case ')':
                    sb.append('o');
                    break;
            }
        }

        return sb.toString();
    }
}