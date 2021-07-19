import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[]arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int amt = scn.nextInt();
        
        int[]dp = new int[amt + 1];
        
        dp[0] = 1;
        
        for(int sum = 1; sum < dp.length; sum++){
            for(int coins = 0; coins < arr.length; coins++){
                
                int val = arr[coins];
                if(sum >= val){
                    int rem = sum - val;
                    if(dp[rem] != 0){
                        dp[sum] += dp[rem];
                    }
                }
            }
        }
        
        System.out.println(dp[amt]);

    }
}