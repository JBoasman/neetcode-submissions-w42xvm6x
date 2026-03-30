class Solution {
    public int mySqrt(int x) {
        int min = 0;
        int max = 46340;

        while (min <= max ) {
            int midPoint = (min + (max - min)/2);
            long midSqrd = (midPoint * midPoint);
            if (midSqrd == x) {
                return midPoint;
            }
            if (midSqrd > x) {
                max = midPoint - 1;
            }
            if (midSqrd < x) {
                min = midPoint + 1;
            }
        }

        return max;
    }
}