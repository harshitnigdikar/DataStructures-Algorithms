import java.io.*;
import java.util.*;

public class Main {
    
    public static int climbTab(int n , int[]jumps , int[]dp){
        
        dp[n] = 1;
        
        for(int i = n - 1; i >= 0; i--){
            
            for(int j = 1; j <=jumps[i] && i + j < dp.length; j++){
                dp[i] +=dp[i + j];
            }
            
        }
        
        return dp[0];
        
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]jumps = new int[n];
        for(int i = 0; i < n; i++){
            jumps[i] = scn.nextInt();
        }
        int ans = climbTab(n , jumps , new int[n + 1]);
        System.out.println(ans);
        
        
    }
}