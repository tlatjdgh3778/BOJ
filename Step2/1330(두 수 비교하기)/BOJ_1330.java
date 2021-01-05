// 1330(두 수 비교하기)

package Step2;

import java.io.*;
import java.util.*;

public class BOJ_1330{
    public static void main(String[] args) throws IOException{
        int A,B;
        //Scanner sc = new Scanner(System.in); // Scanner객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        if(A<B){
            System.out.println("<");
        }
        else if(A==B){
            System.out.println("==");
        }
        else{
            System.out.println(">");
        }
    }
}
