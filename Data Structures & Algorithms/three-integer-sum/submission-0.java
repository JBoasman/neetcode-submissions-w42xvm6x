class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        
        // Use nums.length - 2 because you need at least 3 numbers for a triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same number to avoid duplicate triplets in the output
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1; // Start right after the 'current' fixed number
            int end = nums.length - 1;
            int target = -nums[i];

            while (start < end) {
                int sum = nums[start] + nums[end];
                
                if (sum == target) {
                    // Create the list and add it to our output
                    output.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    // Skip duplicates for the 'start' and 'end' pointers
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;
                    
                    start++;
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return output; // Don't forget to return!
    }
}
