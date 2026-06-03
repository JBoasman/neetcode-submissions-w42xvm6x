class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] output = new int[k]; 

        //Hashmap of every value and its frequency
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : nums) {
            int current = frequency.getOrDefault(n, 0);
            frequency.put(n, current + 1);
        }

        //putting every value in a bucket at an index that corresponds with its frequency
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        List<Integer> numbers = new ArrayList<>(frequency.keySet());
        for (int n : numbers) {
            int f = frequency.get(n);
            buckets.get(f).add(n);
        }

        int kStartIndex = buckets.size() - 1;
        while (k > 0) {
            for (int n : buckets.get(kStartIndex)) {
                output[k - 1] = n;
                k--;
            }
            kStartIndex--;
        }

        return output;
    }
}
