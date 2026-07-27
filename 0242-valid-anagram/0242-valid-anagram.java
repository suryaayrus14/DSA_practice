class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : s.toCharArray()){
            freq1[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            freq2[c - 'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        else{
            return false;
        }

        // HashMap<Character,Integer> smap = new HashMap<>();
        // HashMap<Character,Integer> tmap = new HashMap<>();

        // for(char c: s.toCharArray()){
        //     smap.put(c,smap.getOrDefault(c,0)+1);
        // }
        // for(char c: t.toCharArray()){
        //     tmap.put(c,tmap.getOrDefault(c,0)+1);
        // }

        // return smap.equals(tmap);


    }
}