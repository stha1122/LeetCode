class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer dp[][] =  new Integer[text1.length()][text2.length()];
        return solve(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
    public int solve (String s1,String s2,int idx1,int idx2,Integer dp[][]){
       if(idx1==-1 || idx2==-1){
           return 0;
       }
       if(dp[idx1][idx2]!=null){
           return dp[idx1][idx2];
       }
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2]= 1+solve(s1,s2,idx1-1,idx2-1,dp);
        }

        else{
            int sp1 = solve(s1,s2,idx1-1,idx2,dp); 
            int sp2 = solve(s1,s2,idx1,idx2-1,dp);
            return dp[idx1][idx2]=Math.max(sp1,sp2);
        }
    }
}