class Solution {
    public int[] sortArray(int[] nums) {
        int[] output = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int indexCounter = 0;
        for (int value = -50000; value <= 50000; value++) {
            int repeat = map.getOrDefault(value, 0);
            for (int j = 0; j < repeat; j++) {
                output[indexCounter++] = value;
            }
        }
        return output;
    }
}