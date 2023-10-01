class Solution {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;

        for (int end = 0; end < charArray.length; end++) {
            if (charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word (or the only word if there's no space)
        reverse(charArray, start, charArray.length - 1);

        return new String(charArray);
    }

    private void reverse(char[] charArray, int left, int right) {
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
    }
}



