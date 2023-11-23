class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] last = new int[26];
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            last[str[i] - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length; i++) {
             int currentEnd = last[str[i] - 'a'];
            end = Math.max(end, currentEnd);
            if (i == end) {
                result.add(end - start + 1);
                start = i+1;
            }

           
        }
    return result;
    }
}