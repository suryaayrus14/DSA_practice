class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        List<Integer> al = new ArrayList<>();
         if(n > m)
            return al;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : p.toCharArray()){
            freq1[c-'a']++;
        }
        for(int i = 0;i < n;i++){
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            al.add(0);
        }
        for(int i = n ;i < m;i++){
            freq2[s.charAt(i) -'a']++;
            freq2[s.charAt(i-n) - 'a']--;

            if(Arrays.equals(freq1,freq2)){
                al.add(i-n+1);
            }
        }
    return al;
    }
}