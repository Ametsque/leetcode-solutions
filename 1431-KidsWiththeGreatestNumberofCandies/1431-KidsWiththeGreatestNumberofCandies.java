// Last updated: 29/04/2025, 18:42:33
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> greatestCandiesList = new ArrayList<>();
        int greatestCandies = 0;

        for (int i = 0; i < candies.length; i++){
            if (greatestCandies < candies[i]){
                greatestCandies = candies[i];
            }
        }

        for (int candyAmount : candies){
            greatestCandiesList.add(candyAmount + extraCandies >= greatestCandies);
        }
        return greatestCandiesList;
    }
}