// 2579(계단 오르기)

package Step14;

  import java.io.*;
  
  public class BOJ_2579
  {
      public static void main (String[] args) throws IOException
      {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          int n = Integer.parseInt(br.readLine()); // 계단 수
          
          int[] stair = new int[301];
          int[] dp = new int[301]; 
          
          for(int i=1; i<=n; i++){
              stair[i] = Integer.parseInt(br.readLine());
          }
          // dp[n] = n 번째 계단까지의 최댓값.
          // n 번째 계단은 무조건 밟아야 함.
          // 1.. n-1 번째 계단을 밟은 경우 => n-2 번째 계단은 못 밟음
          // -> dp[n-3] + stair[n-1] + stair[n]
          // 2.. n-1 번째 계단을 밟지 않은 경우 => n-2 번째 계단을 밟음
          // -> dp[n-2] + stair[n]
          
          dp[0] = stair[0];
          dp[1] = stair[1];
          dp[2] = stair[1] + stair[2];
          for(int i=3; i<=n; i++){
              // 2가지 경우 중 최대
              dp[i] = Math.max(dp[i-3] + stair[i-1] + stair[i], dp[i-2] + stair[i]);
          }
          System.out.println(dp[n]);        
      }
  }//https://mygumi.tistory.com/100
