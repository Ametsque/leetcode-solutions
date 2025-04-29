// Last updated: 29/04/2025, 13:36:03
class Solution {
    public boolean isValid(String s) {
        Stack<Character> cStack = new Stack<>();

        for (char c: s.toCharArray()) {
            switch (c) {
                case '(','[','{':
                    cStack.push(c);
                    break;
                case ')':
                    if (!cStack.isEmpty() && cStack.peek() == '(') {
                        cStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!cStack.isEmpty() && cStack.peek() == '[') {
                        cStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!cStack.isEmpty() && cStack.peek() == '{') {
                        cStack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        if (cStack.isEmpty()) {
            return true;
        }

        return false;
    }
}