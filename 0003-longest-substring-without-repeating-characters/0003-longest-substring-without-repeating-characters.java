class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int left = 0;
       int max_length = 0;
       Set<Character> window = new HashSet<>();
       for(int right = 0 ;right<n;right++){
        while(window.contains(s.charAt(right))){
            window.remove(s.charAt(left));
            left++;
        }
        window.add(s.charAt(right));
        max_length = Math.max(max_length,right-left+1);
       }
       return max_length;
        
    }
}