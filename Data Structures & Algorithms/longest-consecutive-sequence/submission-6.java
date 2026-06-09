class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        int i = 1;
        for (int n : set) {
            if (!set.contains(n-1)) {
                int current = 1;
                while(set.contains(n + i)) {
                    current++;
                    i++;
                }
                if (current > max) {
                    max = current;
                }
                i = 1;
            }

        }
        return max;
    }
}
