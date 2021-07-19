import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int prezeros = 1;
    int preones = 1;
    
    int ones = 0;
    int zeros = 0;
    
    for(int length = 2; length <= n; length++){
        
        ones = prezeros + preones;
        zeros = preones;
        
        preones = ones;
        prezeros = zeros;
    }
    
    System.out.println(ones + zeros);
    
 }
}