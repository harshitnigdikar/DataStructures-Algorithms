import java.io.*;
import java.util.*;

public class Main {
    
    public static int climbRec(int n , int[]dp){
        
        if(n == 0){
            return 1;
        }
        
        if(n < 0){
            return 0;
        }
        
        int mn1 = climbRec(n - 1 , dp);
        int mn2 = climbRec(n - 2 , dp);
        int mn3 = climbRec(n - 3 , dp);
        
        int tempAns = mn1 + mn2 + mn3;
        dp[n] = tempAns;
    
        return tempAns; 
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = climbRec(n , new int[n + 1]);
        
        System.out.print(ans);

    }

}    
}
