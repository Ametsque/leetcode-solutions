// Last updated: 29/04/2025, 18:50:40
class Solution {
    public int largestAltitude(int[] gain) {
        int largestNum = 0;
        int altitude = 0;

        for(int rise: gain){
            altitude += rise;
            if (altitude > largestNum){
                largestNum = altitude;
            }
        }

        return largestNum;
    }
}