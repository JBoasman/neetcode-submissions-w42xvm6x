class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> record = new HashSet<>();
        
        //Adds all ints to set
        for (int num : nums) {
            record.add(num);
        }



        for (int i = 0; i < nums.length; i++) { //loops through every starting point
            if (!record.contains(nums[i] - 1)) { //if start is not start of consecutive cycle, skip
                int tempCount = 1;
                for (int j = 1; j < nums.length; j++) {
                    if (record.contains(nums[i]+j)) {
                        tempCount++;
                    } else {
                        break;
                    }
                }
                count = Math.max(count, tempCount);
            }
        }
        return count;
    }
}
