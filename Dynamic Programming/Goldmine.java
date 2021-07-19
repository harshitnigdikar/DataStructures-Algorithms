
import java.io.*;
import java.util.*;

public class Main {
    
        public static int maxGold(int mine[][]){
        int nr = mine.length , nc = mine[0].length;
        int dp[][] = new int[nr][nc];
        
        for(int c = nc-1 ; c>=0 ; c--){
            for(int r = 0 ; r < nr ; r++){
                if(c == nc-1){
                    dp[r][c] = mine[r][c];
                }else{
                    if(r == 0){
                        dp[r][c] = Math.max(dp[r][c+1],dp[r+1][c+1]) + mine[r][c];
                    }else if(r == nr-1){
                        dp[r][c] = Math.max(dp[r][c+1],dp[r-1][c+1]) + mine[r][c];
                    }else{
                        dp[r][c] = Math.max(dp[r][c+1],Math.max(dp[r-1][c+1],dp[r+1][c+1]))+mine[r][c];
                    }
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int r = 0 ; r < nr ;r++){
            max = Math.max(max,dp[r][0]);
        }
        
        return max;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][]arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int x = maxGold(arr);
        
        System.out.println(x);

    }

}