class Solution {
    public int characterReplacement(String s, int k) {
        // Live Inventory Ledger: Keeps track of the exact frequencies of characters 
        // physically sitting inside our sliding window boundaries at all times.
        // Array of size 26 maps 'A'->0, 'B'->1, etc., providing O(1) space and faster access than a HashMap.
        int[] counts = new int[26];
        
        int left = 0;
        int maxLength = 0;
        
        // The "Historical High Score": Tracks the absolute highest frequency achieved by 
        // ANY single character inside ANY valid window we have discovered so far.
        // We purposely refuse to decrement this when the window shrinks!
        int maxFrequency = 0; 

        // The 'right' pointer continuously expands our window across the string
        for (int right = 0; right < s.length(); right++) {
            
            // 1. EXPAND WINDOW BOUNDARY
            // Fetch the incoming character on the right side and record it into our live ledger
            char rightChar = s.charAt(right);
            counts[rightChar - 'A']++;

            // 2. EVALUATE HIGH SCORE
            // Check if the incoming character just broke our historical frequency record.
            // We only look at rightChar because it's the only element whose count increased!
            maxFrequency = Math.max(maxFrequency, counts[rightChar - 'A']);

            // 3. VALIDITY CHECK & SHRINK WINDOW
            // Window Size Formula = (right - left + 1)
            // Replacements Needed Formula = (Current Window Size) - (Historical Max Frequency Record)
            //
            // THE RUNNER-UP TRAP Bypassed: If 'Replacements Needed > k', the window is illegal. 
            // We shrink it from the left, decrementing the evicted character from our live ledger.
            // Notice we NEVER recalculate 'maxFrequency' downward here. To beat our current maxLength,
            // we mathematically need an even higher frequency anyway; runner-ups don't matter!
            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                counts[leftChar - 'A']--; // Subtract 1 from the live ledger as it falls out of the window
                left++;                   // Shrink the window boundary forward
            }

            // 4. TALLY ABSOLUTE MAX RECORD
            // By the time the code reaches here, the window is guaranteed to be valid. 
            // Compare its size against our global maximum substring length record.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
