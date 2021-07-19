import java.io.*;
import java.util.*;

public class Main{

    public static int fibo(int n , int[]dp){
        
        if(n == 0 || n == 1){
            return n;
        }
        
        if(dp[n] != 0){
            return dp[n];
        }
        
        return fibo(n - 1 , dp) + fibo(n - 2 , dp);
        
    }
public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
     int[]dp = new int[n + 1];
    
    int ans = fibo(n , dp);
    
    System.out.println(ans);
    
 }
}