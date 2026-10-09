// thorns and coins
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt = 0;
            for(int i = 0; i <n; i++){
                char c = s.charAt(i);
                if(c=='*'){
                    if(i+1 < n && s.charAt(i+1) == '*') break;
                }
                else if(c=='@') cnt++;
            }
            System.out.println(cnt);
        }
    }
}