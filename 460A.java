import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // socks initially
        int m = sc.nextInt(); // mth day
        
        int day = 0;
        while(n > 0){
            day++;
            n--;
            if(day%m==0) n++;
        }
        System.out.println(day);
    }
}