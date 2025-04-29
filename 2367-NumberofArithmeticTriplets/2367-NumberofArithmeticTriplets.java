// Last updated: 29/04/2025, 19:19:21
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int uniqueTriplets = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (set.contains(diff+num)) {
                if (set.contains(num + 2*diff)) {
                    uniqueTriplets++;
                }
            }
        }

        return uniqueTriplets;
    }
}