import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String dir = sc.next();
        String val = sc.next();
        ArrayList<Character> arr = new ArrayList<>(List.of('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'
        ));
        
        String res="";
        int shift = dir.equals('R') ? -1:1;
        for(char c: val.toCharArray()){
            res+=arr.get(arr.indexOf(c) - shift);
        }
        System.out.println(res);
        
    }
}