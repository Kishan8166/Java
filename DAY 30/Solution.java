import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int max = -10000;
        int sum;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = input.nextInt();
                if ((i > 1) && (j > 1)){
                    sum = arr[i][j] + arr[i-2][j] + arr[i-1][j-1] + arr[i-2][j-1] + arr[i-2][j-2]+ arr[i][j-1] + arr[i][j-2];
                    if (sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
        scanner.close();
    }
}