import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // first check if it contains only 4 or 7: if true then print YES and return
        int n2 = n;
        boolean lucky = true;
        while(n2 > 0){
            int dig = n2 %10;
            if(dig != 7 && dig != 4) lucky = false;
            n2 = n2/10;
        }
        if(lucky) System.out.println("YES");
        else if(n % 4 == 0 || n % 7 == 0 || n % 44== 0 || n % 47== 0 || n %  74== 0 || n %  77== 0 || n %  444== 0 || n %  447== 0 || n %  474== 0 || n %  477== 0 ){ System.out.println("YES");}
        else System.out.println("NO");
        // then check mod of 4 or mod 7 : if true then print YES and return
        // if it reaches here: print NO
    }
}