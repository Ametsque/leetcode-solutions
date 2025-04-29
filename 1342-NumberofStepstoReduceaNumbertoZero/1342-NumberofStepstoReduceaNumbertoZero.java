// Last updated: 29/04/2025, 18:41:34
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        if (num == 0){
            return count;
        } else if (num % 2 == 0) {
            count++;
            count += numberOfSteps(num/2);
            return count;
        } else{
            count++;
            count += numberOfSteps(num-1);
            return count;
        }
    }
}