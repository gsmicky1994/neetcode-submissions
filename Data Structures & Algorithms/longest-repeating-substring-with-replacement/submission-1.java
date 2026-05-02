class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int maxLength = 0;
        int maxFreq = 0; // Max frequency of a single character in the current window
        int[] charCount = new int[26]; // Frequency count for each character
        int left = 0;

        for (int right = 0; right < n; right++) {
            charCount[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, charCount[s.charAt(right) - 'A']);
            
            // Check if the current window is valid
            while ((right - left + 1) - maxFreq > k) {
                charCount[s.charAt(left) - 'A']--;
                left++; // Shrink the window
            }

            // Update the max length of valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}
