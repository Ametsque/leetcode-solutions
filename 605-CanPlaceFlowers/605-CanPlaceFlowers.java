// Last updated: 29/04/2025, 14:49:24
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length < 2) {
            if (flowerbed[0] == 0) {
                n--;
            }
            return (n<=0);
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) {
            n--;
            flowerbed[flowerbed.length-1] = 1;
        }
        for (int i = 1; i < flowerbed.length-1; i++) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }

        return (n<=0);
    }
}