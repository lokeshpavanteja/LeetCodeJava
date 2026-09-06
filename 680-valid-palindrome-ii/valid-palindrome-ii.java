class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray();

        while(left < right){
            if(chars[left] == chars[right]){
                left++;
                right--;
            }
            else {
                return check(chars, left+1, right) || check(chars, left, right-1);
            }
        }
        return true;
    }

    private boolean check(char[] chars, int left, int right){
        while(left < right){
            if(chars[left] != chars[right]){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}