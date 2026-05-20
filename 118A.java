import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        String res= "";
        for(char c: s.toCharArray()){
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'y' || c == 'Y' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                continue;
            }
            if(c < 91) c += 32;
            res += "." + c;
        }
        System.out.println(res);
    }
}