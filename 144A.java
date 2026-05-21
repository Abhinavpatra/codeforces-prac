import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // find smallest index and largest index
        // goal is to move largest to 0 index and smallest to n-1 index, with swaps from neighbours
        int n = sc.nextInt();
        int[] nums = new int [n];
        
        int smallestIndex = 0, smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE, largestIndex = 0;
        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            if(nums[i] <= smallest){ // = beacuse we need the right most smaller number, since that is easier to move to the right
                smallest = nums[i];
                smallestIndex = i;
            }
            if(nums[i] > largest){
                largest = nums[i];
                largestIndex = i;
            }
        }
        int swaps = 0;
        if(largestIndex == smallestIndex) {System.out.println(0); return;};
        if(largestIndex < smallestIndex){
            // then one less total movement
            // 4
//            33 44 11 22
            swaps = largestIndex + (n - 1 - smallestIndex); // 1 + 4 - 1 - 2 = 2 
        }
        else{
            // 7
//            10 10 58 31 63 40 76
            swaps = largestIndex + (n - 1 - smallestIndex - 1);// 6 + 7 - 1 - 1 - 1 = 10
        }
        System.out.println(swaps);
    }
}