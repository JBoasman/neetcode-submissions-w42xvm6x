class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        int mid = 0;
        for (int p : piles) {
            max = Math.max(p, max);
        }
        
        while (min <= max) {
            mid = min + (max - min)/2;
            int midTime = timeToEat(mid, piles);
            if (midTime <= h) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    public int timeToEat(int k, int[] piles) {
        int time = 0;
        for (int p : piles) {
            time = time + (p + k - 1)/k; //adds ceiling of p/k
        }
        return time;
    }
}
