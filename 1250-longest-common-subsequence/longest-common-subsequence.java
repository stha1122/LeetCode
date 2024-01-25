class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer dp[][] =  new Integer[text1.length()][text2.length()];
        return solve3(text1,text2);
    }
    // public int solve (String s1,String s2,int idx1,int idx2,Integer dp[][]){
    //    if(idx1==-1 || idx2==-1){
    //        return 0;
    //    }
    //    if(dp[idx1][idx2]!=null){
    //        return dp[idx1][idx2];
    //    }
    //     if(s1.charAt(idx1)==s2.charAt(idx2)){
    //         return dp[idx1][idx2]= 1+solve(s1,s2,idx1-1,idx2-1,dp);
    //     }

    //     else{
    //         int sp1 = solve(s1,s2,idx1-1,idx2,dp); 
    //         int sp2 = solve(s1,s2,idx1,idx2-1,dp);
    //         return dp[idx1][idx2]=Math.max(sp1,sp2);
    //     }
    // }

    // public int solve2(String s1,String s2){
    //     Integer dp[][] =  new Integer[s1.length()][s2.length()];
    //     for(int idx1=0;idx1<s1.length();idx1++){
    //         for(int idx2=0;idx2<s2.length();idx2++){
    //             if(s1.charAt(idx1)==s2.charAt(idx2)){
    //                 if(idx1-1>=0 && idx2-1>=0){
    //                     dp[idx1][idx2]= 1+dp[idx1-1][idx2-1];}
    //                 else{
    //                        dp[idx1][idx2]=1;  
    //                     }
    //     }

    //              else{
    //                     int sp1 = 0;
                        
    //                     if(idx1-1>=0){ sp1 = dp[idx1-1][idx2];}
                        
    //                     int sp2 = 0;
                        
    //                     if(idx2-1>=0){ sp2 =dp[idx1][idx2-1];}
                        
    //                     dp[idx1][idx2]=Math.max(sp1,sp2);
    //     }
    //         }
    //     }

    //     return dp[s1.length()-1][s2.length()-1];
    // }

     public int solve3(String s1,String s2){
       int dp[][] =  new int[2][s2.length()];
        for(int idx1=0;idx1<s1.length();idx1++){
            for(int idx2=0;idx2<s2.length();idx2++){
                if(s1.charAt(idx1)==s2.charAt(idx2)){
                    if(idx1-1>=0 && idx2-1>=0){
                        dp[1][idx2]= 1+dp[0][idx2-1];}
                    else{
                           dp[1][idx2]=1;  
                        }
        }

                 else{
                        int sp1 = 0;
                        
                        if(idx1-1>=0){ sp1 = dp[0][idx2];}
                        
                        int sp2 = 0;
                        
                        if(idx2-1>=0){ sp2 =dp[1][idx2-1];}
                        
                        dp[1][idx2]=Math.max(sp1,sp2);
        }
            }

            dp[0]=dp[1];
            dp[1]=new int[s2.length()];
        }

        return dp[0][s2.length()-1];
    }
}