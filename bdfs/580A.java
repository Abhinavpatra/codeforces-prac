import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // length max non decreasing => equal or increasing substring
        int[] arr =new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt=1;
        int maxC = 1;
        for(int i = 1 ; i < n; i++){
            if(arr[i-1]<= arr[i]) cnt++;
            else cnt = 1;
            maxC = Math.max(cnt, maxC);
        }
        System.out.println(maxC);
    }
}