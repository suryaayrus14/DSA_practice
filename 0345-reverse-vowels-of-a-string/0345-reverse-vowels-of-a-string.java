class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] charr = s.toCharArray();

        while(left < right)
        {
            if((isVowel(charr[left])) && (isVowel(charr[right]))){
                char ch = charr[left];
                charr[left] = charr[right];
                charr[right] = ch;
                left++;
                right--;
            }
            else if(isVowel(charr[left])){
                right--;
            }
            else if(isVowel(charr[right]))
            {
                left++;
            }
            else{
                left++;
                right--;
            }
        }
        String res = new String(charr);
        return res;
    }
    public boolean isVowel(char c){
       return "AEIOUaeiou".indexOf(c) != -1;
    }
}