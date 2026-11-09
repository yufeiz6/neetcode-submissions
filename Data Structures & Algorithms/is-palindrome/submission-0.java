class Solution {
    public boolean isPalindrome(String s) {
        char[] words = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(words[i])) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(words[j])) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i ++;
                j --;
            } else {
                return false;
            }
        }
        return true;
    }
}
