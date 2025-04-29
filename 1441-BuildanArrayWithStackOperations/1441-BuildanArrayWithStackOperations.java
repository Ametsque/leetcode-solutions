// Last updated: 29/04/2025, 18:43:32
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int stackPointer = 0;
        ArrayList<String> stackOps = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= n; i++) {
            if (stackPointer == target.length) {
                break;
            }
            stack.push(i);
            stackOps.add("Push");

            if (i != target[stackPointer]) {
                stack.pop();
                stackOps.add("Pop");
            } else {
                stackPointer++;
            }
        }

        return stackOps;
    }
}