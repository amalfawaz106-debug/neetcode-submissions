class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(int i=0 ; i< s.length() ; i++){
                char c = s.charAt(i);
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!res.containsKey(key)){
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}
