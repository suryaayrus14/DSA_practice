class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        long k = 0;
        for(int i = shifts.length-1;i>=0;i--){
            k = (k + shifts[i])%26;
            char ch = s.charAt(i);
            sb.append((char)('a' + (((ch - 'a')+k)%26)));
        }
        return sb.reverse().toString();
    }
}