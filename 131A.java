import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        boolean allRemainingUpper = true;
// all upper
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 91) { 
                allRemainingUpper = false;
                break;
            }
        }

        String res = "";
// if changed
        if (allRemainingUpper) {
            // First char is upper (so ALL are upper) -> invert all to lower
            // OR First char is lower (all others upper) -> invert first to upper, rest to lower
            for (char c: s.toCharArray()) {
                if (c < 91) {
                    res += (char) (c + 32);
                } else {
                    res += (char) (c - 32);
                }
            }
        } else {
            res = s;
        }
        System.out.println(res);
    }
}