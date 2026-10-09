import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> mp = new HashMap<>();
       for(int i = 0; i < n; i++){
           String s = sc.next();
           if(!mp.containsKey(s)){
               System.out.println("OK");
               mp.put(s,1);
           }
           else{
               int cnt = mp.get(s);
               System.out.println(s+ cnt);
               mp.put(s, cnt + 1);
           }
       }
    }
}