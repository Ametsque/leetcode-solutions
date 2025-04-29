// Last updated: 29/04/2025, 18:47:29
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++){
            int runSum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                runSum = runSum + accounts[i][j];
                sum = runSum > sum ? runSum : sum;
            }
        }
        return sum;
    }
}