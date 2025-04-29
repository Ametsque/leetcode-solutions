// Last updated: 29/04/2025, 18:41:12
class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        } else if (n==1 || n==2) {
            return 1;
        }
        
        int term1 = 0;
        int term2 = 1;
        int term3 = 1;

        for (int i = 3; i < n+1; i++) {
            int sum = term1 + term2 + term3;
            term1 = term2;
            term2 = term3;
            term3 = sum;
        }

        return term3;
    }
}