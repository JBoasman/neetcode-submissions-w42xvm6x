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
                int currentNum = nums[i];
                while (record.contains(currentNum+1)) {
                    tempCount++;
                    currentNum++;
                }   
                count = Math.max(count, tempCount);
            }
        }
        return count;
    }
}
