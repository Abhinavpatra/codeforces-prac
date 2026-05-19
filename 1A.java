import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int blocks = 0;
        int tiles = (n + a - 1) / a; //for m
        tiles *= (m+a-1)/a; // for n
        System.out.println(blocks);
    }
}