class Solution {
    public int characterReplacement(String s, int k) {
        
        int start = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] charFreq = new int[26];

        for(int end = 0;end<s.length();end++){
            charFreq[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, charFreq[s.charAt(end) - 'A']);

            if((end - start + 1) - maxFreq > k){
                charFreq[s.charAt(start) - 'A']--;
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
