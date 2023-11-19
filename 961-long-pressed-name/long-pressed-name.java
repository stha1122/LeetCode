class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // Get the lengths of the name and typed strings
        int n = name.length();
        int m = typed.length();

        // Check if the length of name is greater than the length of typed
        if (n > m)
            return false;

        // Check if the first characters of name and typed are different
        if (name.charAt(0) != typed.charAt(0))
            return false;

        // Initialize indices for the name and typed strings
        int i = 0, j = 0;

        // Iterate through the characters of both strings
        while (i < n && j < m) {
            // If characters match, increment both indices
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // If characters don't match and the previous character in the name matches the current typed character,
            // increment the typed index
            else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            }
            // If characters don't match and the previous condition is not met, return false
            else {
                return false;
            }
        }

        // Check if there are remaining characters in the typed string
        while (j < m) {
            // If there are remaining characters and they match the last character in the name, increment the typed index
            if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) j++;
            else return false;
        }

        // Check if there are remaining characters in the name
        if (i < n) return false;

        // If all conditions are met, return true
        return true;
    }
}
