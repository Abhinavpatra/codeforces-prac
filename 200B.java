import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double k = n;
        double sum = 0;
        while(n > 0){
            int x  = sc.nextInt();
            sum += x;
            n--;
        }
        sum /=k;
        System.out.println(sum);
    }
}
