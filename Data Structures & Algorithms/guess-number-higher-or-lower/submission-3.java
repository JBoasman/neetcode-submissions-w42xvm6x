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
        int min = 0;
        int max = n;
        
        while (min <= max) {
            int mid = guess(min + (max-min)/2);
            if (mid == 0) {
                return (min + (max-min)/2);
            }
            if (mid == -1) {
               max = (min + (max-min)/2) - 1;
            } 
            if (mid == 1) {
                min = (min + (max-min)/2) + 1;
            }
        }
        return -15;
    }
}