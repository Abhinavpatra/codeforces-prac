import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // a simple hashmap mp1 of str1 and str2 and then a hashmap mp2 of str3 and if mp1 == mp2 then YES else NO
        String str1 = sc.nextLine(); 
        String str2 = sc.nextLine(); 
        String str3 = sc.nextLine();
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char c: str1.toCharArray()){
            if(mp.containsKey(c)) mp.put(c, mp.get(c) + 1);
            else mp.put(c, 0);
        }
        for(char c: str2.toCharArray()){
            if(mp.containsKey(c)) mp.put(c, mp.get(c) + 1);
            else mp.put(c, 0);
        }
        HashMap<Character, Integer> mp2 = new HashMap<>();

        for(char c: str3.toCharArray()){
            if(mp2.containsKey(c)) mp2.put(c, mp2.get(c) + 1);
            else mp2.put(c, 0);
        }
        // mp and mp2 have been filled, now to compare them
        for(int i = 1; i < 26; i++){
            if(mp.get((char) (i+65)) != mp2.get((char) (i+65))) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}