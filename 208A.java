import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String comp = "WUB";
        String res = "";
        boolean check=true;
        int len = str.length();
        for(int i = 0; i < len; ){
            if( i < len - 2  && comp.equals(str.substring(i,i+3)) ){ // i < len-2 check for the last out of bounds issue, and is written first so that the second condition is never executed if that is the issue
                i+=3;
                check = false;
            }
            else{
                if(!check) res+=" ";
                res+=str.charAt(i);
                check = true;
                i++;
            }
        }
        System.out.println(res.strip()); // removes whitespaces which are there because of initial space addition
    }
}