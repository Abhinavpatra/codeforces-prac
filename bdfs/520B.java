import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // n is initial value
        // m is the value we want
        // red: * 2
        // blue: -1
        // reverse greedy approach
        int res = 0; 
        while(m > n){
            if(m%2==0) m/=2;
            else m+=1;
            res++;
        }
        System.out.println(res+ n-m);
    }
}