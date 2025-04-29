// Last updated: 29/04/2025, 18:44:28
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottlesRemaining = numBottles;
        int bottlesDrunk = numBottles;
        int bottlesLeft = numBottles / numExchange;
        int excessBottles;
        while(bottlesLeft != 0){
            excessBottles = 0;
            bottlesDrunk += bottlesLeft;
            excessBottles += (totalBottlesRemaining) % numExchange;
            totalBottlesRemaining = totalBottlesRemaining + bottlesLeft - numExchange*bottlesLeft;
            bottlesLeft = (bottlesLeft+excessBottles)/numExchange;
        }
        return bottlesDrunk;
    }
}