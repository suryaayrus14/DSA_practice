class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        boolean ans = true;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
               ans = isPalindrome(s,left+1,right);
                if(ans){
                    return true;
                }
                else{
                    ans = isPalindrome(s,left,right-1);
                    return ans;
                }
            }
            left++;
            right--;
        }
    return ans;
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left <  right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}