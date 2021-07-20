// 1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
// 2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
// 3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    long prespace = 1;
    long prebuild = 1;
    
    long space = 0;
    long build = 0;
    
    for(int i = 2; i <= n; i++){
        build = prespace;
        space = prespace + prebuild;
        
        prespace = space;
        prebuild = build;
    }
    
    long oneSide = space + build;
    
    System.out.print(oneSide * oneSide);
 }

}