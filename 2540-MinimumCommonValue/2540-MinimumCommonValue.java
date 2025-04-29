// Last updated: 29/04/2025, 19:35:50
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0;

        while (nums1[pointer1] != nums2[pointer2]) {
            if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
            if (pointer1 >= nums1.length || pointer2 >= nums2.length) {
                return -1;
            }
        }

        return nums1[pointer1];
    }
}