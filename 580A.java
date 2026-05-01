import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        int maxCount = 1;
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int count = 1;
        for(int i = 1; i < n; i++){           
            if(nums[i] >= nums[i-1]){
                count++;
            }else count = 1;
            
            if(count > maxCount) maxCount = count;
        }
        System.out.println(maxCount);
    }
}