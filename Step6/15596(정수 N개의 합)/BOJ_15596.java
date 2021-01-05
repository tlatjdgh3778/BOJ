// 15596(정수 N개의 합)

package Step6;

public class BOJ_15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++){
            ans = ans + a[i];
        }
        return ans;
    }
}

