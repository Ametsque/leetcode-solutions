// Last updated: 29/04/2025, 14:41:47
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int pivot = 1;
        int start = 1;
        int bound = n;

        while (guess(pivot) != 0){
            pivot = start + ((bound - start) / 2);
            switch(guess(pivot) + 1) {
                case 0:
                    bound = pivot;
                    break;
                case 2:
                    start = pivot + 1;
                    break;
            }
        }
        return pivot;
    }
}