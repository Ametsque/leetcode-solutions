// Last updated: 29/04/2025, 18:44:09
class Solution {
    public double average(int[] salary) {
        int maximum = 0;
        int minimum = Integer.MAX_VALUE;

        double average = 0.0;

        for (int num : salary) {
            if (num > maximum) {
                maximum = num;
            } 
            if (num < minimum) {
                minimum = num;
            }
        }

        for (int num : salary) {
            if (num != maximum && num != minimum) {
                average += num;
            }
        }

        return (average / (salary.length-2));
    }
}