// Last updated: 29/04/2025, 18:41:52
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        int largestNum = -1;

        for (int num : arr) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        for (int key : numMap.keySet()) {
            if (numMap.get(key) == key) {
                if (key > largestNum) {
                    largestNum = key;
                }
            }
        }

        return largestNum;
    }
}