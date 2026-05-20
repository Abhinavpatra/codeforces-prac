import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int check = 0; 
        for(char c : s.toCharArray()){
            if(c == 'h' && check == 0) check = 1;
            if(c == 'e' && check == 1){ check = 2;  continue;}
            if(c == 'l' && check == 2){ check = 3; continue;}
            if(c == 'l' && check == 3){ check = 4; continue;}
            if(c == 'o' && check == 4){ check = 5; continue;}
            // h then e then l then l then o
        }
        if(check == 5) System.out.println("YES");
        else System.out.println("NO");
    }
}