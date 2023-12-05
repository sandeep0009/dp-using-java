import java.util.Arrays;


class frogjump{

    //memoizatoin
    public static int solve(int ind,int[]height,int[]dp){
        if(ind==0)return 0;
        int right=Integer.MAX_VALUE;
        int left= solve(ind-1,height,dp)+(int)Math.abs(height[ind]-height[ind-1]);
        if(ind>1)
        right=solve(ind-2,height,dp)+(int)Math.abs(height[ind]=height[ind-2]);

        return dp[ind]=Math.max(right,left);

    }

    public static void main(String[] args) {
        int[]height={20,10,50,60,10,10};
        int[]dp=new int[height.length+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(height.length-1, height, dp));

    }
}