class Solution {
    public int fib(int n) {
        // TOP- DOWN
        // int[] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // if(n == 0 || n == 1){
        //     return n;
        // }
        // if(dp[n] != -1){
        //     return dp[n];
        // }
        // return dp[n] = fib(n-1) + fib(n-2);

        // BOTTOM-UP
        int[] dp = new int[n+1];
        if(n>0) {
        dp[0] = 0;
        dp[1] = 1;
        }
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

        //SPACE OPTIMISATION
        // int prev1 = 1;
        // int prev2 = 0;
        
        // if(n == 0 || n == 1){
        //     return n;
        // }

        // for(int i=2; i<=n; i++){
        //     int temp = prev1 + prev2;
        //     prev2 = prev1;
        //     prev1 = temp;
        // }

        // return prev1;
    }
}