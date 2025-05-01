class Solution {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            String subStr = s.substring(begin, i);
            String temp = Character.toString(s.charAt(i));
            if (subStr.contains(temp)) {
                longest = Math.max(longest, subStr.length());
                begin = s.indexOf(temp, begin) + 1;
            }
        }
        longest = Math.max(longest, s.length() - begin);
        return longest;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println("DEBUG: String 1 Output: " + solution.lengthOfLongestSubstring(s1));
        System.out.println("DEBUG: String 2 Output: " + solution.lengthOfLongestSubstring(s2));
        System.out.println("DEBUG: String 3 Output: " + solution.lengthOfLongestSubstring(s3));
    }
}