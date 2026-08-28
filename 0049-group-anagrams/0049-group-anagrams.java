class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String str : strs) {
            int[] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            List<String> list = hm.getOrDefault(key, new ArrayList<>());
            list.add(str);
            hm.put(key, list);
        }
         return new ArrayList<>(hm.values());
    }
}