class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int indexA = 0;
        int indexB = heights.length - 1;
        while (indexA < indexB) {
            maxA = Math.max(maxA, container(heights, indexA, indexB));
            if (heights[indexA] < heights[indexB]) {
                indexA++;
            } else {
                indexB--;
            }
        }
        return maxA;
          
    }

    public int container(int[] heights, int indexA, int indexB) {
        return Math.min(heights[indexA], heights[indexB]) * Math.abs(indexA - indexB);
    }
}
