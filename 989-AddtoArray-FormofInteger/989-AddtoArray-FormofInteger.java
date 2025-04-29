// Last updated: 29/04/2025, 18:37:10
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String kString = String.valueOf(k);
        int startIndex;
        ArrayList<Integer> totalNum = new ArrayList<>();

        if (kString.length() < num.length) {
            startIndex  = num.length - kString.length();
            for (int i = 0; i < num.length; i++) {
                if (i >= startIndex) {
                    totalNum.add(Character.getNumericValue(kString.charAt(i - startIndex)) + num[i]);
                } else {
                   totalNum.add(num[i]); 
                }
            }
        } else {
            startIndex = kString.length() - num.length;
            for (int i = 0; i < kString.length(); i++) {
                if (i >= startIndex) {
                    totalNum.add(Character.getNumericValue(kString.charAt(i)) + num[i - startIndex]);
                } else {
                   totalNum.add(Character.getNumericValue(kString.charAt(i))); 
                }
            }
        }

        startIndex = totalNum.size() - 1;

        for (int j = startIndex; j > 0; j--) {
            if (totalNum.get(j) > 9) {
                totalNum.set(j-1, totalNum.get(j-1) + (totalNum.get(j) / 10));
                totalNum.set(j, totalNum.get(j) % 10);
            }
        }

        while (totalNum.get(0) > 9) {
            int temp = totalNum.get(0);
            totalNum.set(0, temp % 10);
            totalNum.add(0, temp / 10);
        }

        return totalNum;
    }
}