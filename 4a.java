import java.util.*;
import java.io.*;

public class Main{
     public static void main(String args[]) throws IOException {
         Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
         if(m==2) System.out.println("NO");
         else if(m%2==0) System.out.println("YES");
         else System.out.println("NO");
     }
}
