class Solution {
  public int numDistinct(String s, String t) {
    if (s.length() < t.length()) {
      return 0;
    }
    if (s.length() == t.length()) {
      return s.equals(t) ? 1 : 0;
    }
    char[] S = s.toCharArray();
    char[] T = t.toCharArray();
    int[] dp = new int[T.length + 1];
    dp[0] = 1;
    for (int i = 1; i <= S.length; i++) {
      for (int j = T.length; j > 0; j--) {
        if (S[i - 1] == T[j - 1]) {
          dp[j] += dp[j - 1];
        }
      }
    }
    return dp[T.length];
  }
}