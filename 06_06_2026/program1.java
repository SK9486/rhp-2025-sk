class Solution {
    public int minFallingPathSum(int[][] arr) {
        if(arr[0].length == 1){
            return arr[0][0]; 
        }
        int[][] dp = new int[arr[0].length][arr.length];
        int firstMin = -1;
        int secMin = -1;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(i != 0){
                firstMin = getFirstMin(dp, i-1);
            }
            for(int j=0;j<arr[0].length;j++){
                // System.out.print("["+i+","+j+"] : "+arr[i][j]+"  ");
                if(i == 0){
                    dp[i][j] = arr[i][j];
                    // System.out.println("dp : "+dp[i][j]);
                }else{
                    // System.out.println("prev : "+arr[i-1][j]);
                    if(dp[i-1][j] == firstMin){
                        secMin = getSecoundMin(dp, i-1, j);
                        sum = secMin + arr[i][j];
                        dp[i][j] = sum;
                        // System.out.println("sum (secMin) : "+sum);
                    }else{
                        sum = firstMin + arr[i][j];
                        dp[i][j] = sum;
                        // System.out.println("sum (fstMin) : "+sum);
                    }

                }
            }
            // System.out.println();
        }
        return getFirstMin(dp, dp.length-1);
        // System.out.println("fistMIn (res) : "+res);

        // System.out.println("dp : ");
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
    }
    public static int getFirstMin(int[][] arr,int a){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr[0].length;i++){
            if(arr[a][i]<min){
                min = arr[a][i];
            }
        }
        // System.out.println("fistMin : "+min);
        return min;
    }
    public static int getSecoundMin(int[][] arr, int a,int b){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr[0].length;i++){
            if(arr[a][i]<min && i!=b){
                min = arr[a][i];
            }
        }
        // System.out.println("secMin : "+min);
        return min;
    }
}
