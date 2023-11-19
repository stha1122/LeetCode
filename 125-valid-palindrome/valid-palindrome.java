class Solution {
    public boolean isPalindrome(String s) {
        // Use two pointers approach to check if the string is a palindrome

        // Convert the string to lowercase and remove non-alphanumeric characters
        StringBuilder cleanedString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanedString.append(Character.toLowerCase(ch));
            }
        }

        // Use two pointers to check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
