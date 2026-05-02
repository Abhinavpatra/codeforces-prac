import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of students : 4
        int m = sc.nextInt(); // number of puzzles : 6
        int[] nums = new int[m];
        for(int i = 0; i < m; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        // max difference in a subarray of length n
        for(int i = 0; i <= m-n; i++){
            int diff = nums[i + n - 1] - nums[i];
            if(diff < minDiff) minDiff = diff;
        }
        System.out.println(minDiff);
    }
}