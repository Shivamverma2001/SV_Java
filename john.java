import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class john {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(sc.nextLine());
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) == 'c') || (s1.charAt(i) == 'o') || (s1.charAt(i) == 'v') || (s1.charAt(i) == 'i')
                    || (s1.charAt(i) == 'd'))
                s2.append(s1.charAt(i));
        }
        System.out.println(s2.toString());
        int k = 0;
        for (int i = 0; i < s2.length();) {
            if ((s2.indexOf("covid", i) != 0) || (s2.indexOf("covdi", i) != 0) || (s2.indexOf("codvi", i) != 0)
                    || (s2.indexOf("cdovi", i) != 0) || (s2.indexOf("dcovi", i) != 0) || (s2.indexOf("coivd", i) != 0)
                    || (s2.indexOf("ciovd", i) != 0) || (s2.indexOf("icovd", i) != 0) || (s2.indexOf("codvi", i) != 0)
                    || (s2.indexOf("cvoid", i) != 0) || (s2.indexOf("vcoid", i) != 0) || (s2.indexOf("coidv", i) != 0)
                    || (s2.indexOf("cviod", i) != 0) || (s2.indexOf("cvido", i) != 0) || (s2.indexOf("ocvid", i) != 0)
                    || (s2.indexOf("coidv", i) != 0) || (s2.indexOf("ovcid", i) != 0) || (s2.indexOf("ovicd", i) != 0)
                    || (s2.indexOf("ovidc", i) != 0)) {
                k++;
                i += 5;
            } else
                i++;
        }
        System.out.println(k);
    }
}