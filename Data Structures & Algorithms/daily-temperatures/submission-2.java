class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] output = new int[n]; 
        ArrayDeque<Integer> stack = new ArrayDeque<>(); 
        
        
        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            
            // While the stack has waiting days, AND today is hotter than the waiting day...
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                // The day at the top of the stack finally found a warmer day!
                int prevDayIndex = stack.pop(); 
                
                // The days waited is just the difference in their indices
                output[prevDayIndex] = i - prevDayIndex; 
            }
            
            // Today has to wait for a warmer day, so put its index on the stack
            stack.push(i);
        }
        
        return output;
    }
}
