import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        int count1 = 0, count2 = 0;
        
        for(int i  = 0; i < n; i++){
            int weight = sc.nextInt();
            if(weight == 100) count1++;
            else count2++;            
        }
// 100 should be even and/ or 200 
// if 100 odd then NO
// if 100 even and 200 is even then it works
// if no 100 then odd 200 again NO
        if(count1 % 2 != 0 || (count1 == 0 && count2 % 2 != 0 )) System.out.println("NO");
        else System.out.println("YES");
    }
}
