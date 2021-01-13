// 1904(01타일)

package Step14;

 import java.io.*;
 
 public class BOJ_1904
 {
     public static void main (String[] args) throws IOException
     {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         int n = Integer.parseInt(br.readLine());
         int[] dp = new int[1000001]; 
         
         // n>2 ... 3부터
         // dp[n] = dp[n-1] + n-2
         
         dp[0] = 0;
         dp[1] = 1;
         dp[2] = 2;
         int mod = 15746;
         for(int i=3; i<=n; i++){
             dp[i] = ( (dp[i-1]%mod) + (dp[i-2]%mod) )%mod;
         }
         System.out.println(dp[n]);
     }
 }
