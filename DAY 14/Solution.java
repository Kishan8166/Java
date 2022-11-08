import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String A=sc.next();
        String B=sc.next();
        
        // We use print format and we sum the lengths of A and B for operation 1
        System.out.printf("%d \n", A.length() + B.length());
        
        // We use ternary operator and StringA.comparteTo(StringB) method to determine if A is lexicographically larger than B 
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        // We use print format and a new method created below to capitalize the first letter in A and B and print them on a single line, separated by a space. 
        System.out.printf("%s %s \n", capitalize(A), capitalize(B));
    }
    
    // Method to capitalize
    public static String capitalize(String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}