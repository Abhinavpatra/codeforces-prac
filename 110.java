import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // count number of 4's and 7's in the number
        //  check if all the digits of that count are either 4 or 7
        long n1 = sc.nextLong();
        int count = 0;
        while(n1 > 0){
            if (n1%10 == 4 || n1%10 == 7) count++;
            n1= n1/10;
        }
        if(count == 0){
            System.out.println("NO");
            return;
        }
        boolean check= true;
        while(count > 0){
            if (count % 10 != 4 && count % 10 != 7){ check = false; break;}
            count= count/10;
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
        
    }
}