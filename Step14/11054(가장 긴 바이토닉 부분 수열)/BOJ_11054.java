// 11054(가장 긴 바이토닉 부분 수열)

package Step14;


import java.util.*;
import java.io.*;

public class BOJ_11054
{
   public static int N;
   public static int[] arr;
   public static Integer[] l_DP;
   public static Integer[] r_DP;
   
   public static StringTokenizer st;
   public static void main (String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      N = Integer.parseInt(br.readLine());
      
      arr = new int[N];
      l_DP = new Integer[N];
      r_DP = new Integer[N];
      
      st = new StringTokenizer(br.readLine());
      for(int i=0; i<N; i++){
         arr[i] = Integer.parseInt(st.nextToken());
      }
      for(int i=0; i<N; i++){
      	LIS(i);
      	LDS(i);
      }
      int max = 1;
      
      for(int i=0; i<N; i++){
      	max = Math.max(l_DP[i] + r_DP[i], max);
      }
      System.out.println(max-1);
   }
   public static int LIS(int n){
      if(l_DP[n] == null){
         l_DP[n] = 1;
         for(int i = n - 1; i>=0; i--){
            if(arr[i] < arr[n]){
               l_DP[n] = Math.max(l_DP[n], LIS(i) + 1);
            }
         }
      }
      return l_DP[n];
   }
	public static int LDS(int n){
	      if(r_DP[n] == null){
	         r_DP[n] = 1;
	         for(int i = n + 1; i< r_DP.length; i++){
	            if(arr[i] < arr[n]){
	               r_DP[n] = Math.max(r_DP[n], LDS(i) + 1);
	            }
	         }
	      }
	      return r_DP[n];
	   }
}
