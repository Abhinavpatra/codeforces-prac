import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        for(char c: code.toCharArray()){
            if(c=='H' || c=='Q' || c=='9'|| c=='+'){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}