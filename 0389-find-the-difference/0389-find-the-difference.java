class Solution {
    public char findTheDifference(String s, String t) {

        if(s.length() == 0){
            return t.charAt(0);
        }
      char res =' ';

       String all = s+t;
       char[] ch = all.toCharArray();

       for(char c:ch){
        res ^=c;
    }
    return (char)(res + 32);
}
}