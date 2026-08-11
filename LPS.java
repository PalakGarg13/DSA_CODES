class Solution {
    Integer[][] dp;
    public int longestPalindromeSubseq(String s) {
        int i=0,n=s.length();
        dp = new Integer[n][n];
        return helper(s,i,n-1);
    }
    public int helper(String s, int i, int j){
     if(i>j) return 0;
     if(i==j) return 1;
     if(dp[i][j]!=null) return dp[i][j];
     if(s.charAt(i) == s.charAt(j)) return dp[i][j] = 2+helper(s,i+1,j-1);
     return dp[i][j] = Math.max(helper(s,i+1,j),helper(s,i,j-1));
    }
}