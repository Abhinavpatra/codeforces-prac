import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for(int i = 0;i < n; i++){
            int dig = sc.nextInt();
            sum+=dig;
            arr[i] = dig;
        }
        // decreasing order
        Arrays.sort(arr);
        int newSum = 0;
        for(int i = n-1; i >= 0; i--){
            newSum += arr[i];
            sum-=arr[i];
            if(newSum > sum){
                System.out.println(n-i);
                return;
            }
        }
    }
}