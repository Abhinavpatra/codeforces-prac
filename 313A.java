import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        if(n >= 0) {System.out.println(n); return;}
        int last = n/10;

        int secondLast = (n/100) * 10 + (n % 10);
        System.out.println(Math.max(last, secondLast));
    }
}