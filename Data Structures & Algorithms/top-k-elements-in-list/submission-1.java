class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for (int num : nums) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];

        numsCount.forEach((num, frequency) -> {
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>(); // Create it if it doesn't
            }
            buckets[frequency].add(num);
        });

        int[] result = new int[k];
        int counter = 0;

        for (int i = buckets.length - 1; i >= 0 && counter < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[counter] = num;
                    counter++;
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}

