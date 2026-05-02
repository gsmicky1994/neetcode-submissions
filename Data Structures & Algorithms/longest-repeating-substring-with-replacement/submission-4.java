class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] charFreq = new int[26];

        for(int right=0;right<s.length();right++){

            charFreq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, charFreq[s.charAt(right) - 'A']);
            while((right - left + 1) - maxFreq > k){
                charFreq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;

    }
}
