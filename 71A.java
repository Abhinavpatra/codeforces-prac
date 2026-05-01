import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        for(int i = 0; i < n; i++) input[i] = sc.next();
        
        for(int i = 0; i < n; i++){
            int len = input[i].length();
            if(len <= 10) System.out.println(input[i]);
            else{
                System.out.print(input[i].charAt(0));
                System.out.print(len - 2);
                System.out.print(input[i].charAt(len - 1));
                System.out.println("");
            }
        }
    }
}