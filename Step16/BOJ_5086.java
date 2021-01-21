// 5086(배수와 약수)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_5086 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a == 0) {
                break;
            }
            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
        // eof
        // (input = br.readLine()) != null
    }
}