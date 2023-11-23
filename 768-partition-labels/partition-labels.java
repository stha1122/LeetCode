class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] last = new int[26];
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            last[str[i] - 'a'] = i;
        }

        int start = 0;
        int end = last[str[start] - 'a'];
        for (int i = 1; i < str.length; i++) {
            final int currentEnd = last[str[i] - 'a'];

            if (i > end) {
                result.add(end - start + 1);
                start = i;
            }

            end = Math.max(end, currentEnd);
        }

        result.add(end - start + 1);

        return result;
    }
}