class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int smallIndex = 0;
        int largeIndex = numbers.length - 1;
        while (smallIndex < largeIndex) {
            int smallVal = numbers[smallIndex];
            int largeVal = numbers[largeIndex];
            if (smallVal + largeVal == target) {
                return new int[] {smallIndex + 1, largeIndex + 1};
            } else if (smallVal + largeVal < target) {
                smallIndex++;
            } else {
                largeIndex--;
            }
        }
        return new int[] {};
    }
}
