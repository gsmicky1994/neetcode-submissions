class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){

            int[] charFreq = new int[26];
            for(char c: str.toCharArray()){
                charFreq[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int count: charFreq){
                sb.append("#").append(count);
            }
            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
