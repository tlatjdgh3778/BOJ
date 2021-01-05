// 9498(시험 성적)

package Step2;

import java.io.*;

public class BOJ_9498{

   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int score = Integer.parseInt(br.readLine());

       /*if(0 > score || score > 100)
       {
         System.out.println("0에서 100사이의 값을 입력하세요");
       }
       else{*/
       if(score >= 90){
           System.out.println("A");
       }
       else if(score >= 80){
           System.out.println("B");
       }
       else if(score >= 70){
           System.out.println("C");
       }
       else if(score >= 60){
           System.out.println("D");
       }
       else{
           System.out.println("F");
       }
    }
}


