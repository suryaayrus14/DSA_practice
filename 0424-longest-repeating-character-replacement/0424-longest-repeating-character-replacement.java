class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        int maxFreq = 0;
        char[] arr = s.toCharArray();
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(arr[right]));

            while ((right - left + 1) - maxFreq > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;

            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}