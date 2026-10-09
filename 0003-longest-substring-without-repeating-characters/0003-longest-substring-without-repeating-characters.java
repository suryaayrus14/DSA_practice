class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int max_length = Integer.MIN_VALUE;
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        char[] ch = s.toCharArray();
        for(int right = 0;right < ch.length;right++){
            while(hs.contains(ch[right])){
                hs.remove(ch[left]);
                left++;
            }
            hs.add(ch[right]);
            max_length = Math.max(max_length,right-left+1);


        }
        return max_length;
        
    }
}