// 11050(이항 계수 1)

package Step16;

import java.util.*;
import java.io.*;

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a - b;
        int a_mul = 1;
        int b_mul = 1;
        for (int i = a; i > c; i--) {
            a_mul = a_mul * i;
        }
        for (int i = b; i > 0; i--) {
            b_mul = b_mul * i;
        }
        System.out.println(a_mul / b_mul);
    }

}
