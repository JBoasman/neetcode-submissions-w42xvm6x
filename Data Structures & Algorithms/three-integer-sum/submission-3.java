class Solution {
    public List<List<Integer>> output = new ArrayList<>();
    
    public List<List<Integer>> threeSum(int[] nums) { 
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                twoSum(nums, -nums[i], i+1);
            }
        }
        return output;
    }


        public void twoSum(int[] numbers, int target, int smallIndex) {
        int largeIndex = numbers.length - 1;
        while (smallIndex < largeIndex) {
            int smallVal = numbers[smallIndex];
            int largeVal = numbers[largeIndex];
            if (smallVal + largeVal == target) {
                output.add(Arrays.asList(-target, smallVal, largeVal));
                smallIndex++;
                largeIndex--;
                
                while (smallIndex < largeIndex && numbers[smallIndex] == numbers[smallIndex - 1]) {
                    smallIndex++;
                }
                while (smallIndex < largeIndex && numbers[largeIndex] == numbers[largeIndex + 1]) {
                    largeIndex--;
                }
            } else if (smallVal + largeVal < target) {
                smallIndex++;
            } else {
                largeIndex--;
            }
            
        }
    }
}