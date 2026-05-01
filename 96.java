import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String digs = sc.next();
        int count = 1;
        for(int i = 0; i < digs.length()-1; i++){
            if(digs.charAt(i) == digs.charAt(i+1)) count++;
            else count = 1;
            if(count >= 7){
                System.out.println("YES");
                break;
            }
        }
        if(count < 7) System.out.println("NO");
    }
}