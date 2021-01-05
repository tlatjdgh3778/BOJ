// 4637(셀프 넘버)

package Step6;

public class BOJ_4673
{
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean arr[] = new boolean[10000];
		for(int i=1; i<10000; i++){
			if(self_number(i) <= 10000){
				arr[self_number(i)-1]=true;
			}
		}
		for(int j=0; j<10000; j++){
			if(!arr[j]){ //false... self number?
				System.out.println(j+1);
			}
		}
	}
	public static int self_number(int n){ 
		int num = n;
		int tmp = num;
		int ans = 0;
		
		while(true){
			ans = ans + tmp%10;
			if(tmp/10 == 0){
				break;
			}
			else{
				tmp = tmp/10;
			}
		}
		ans = ans + num;
		return ans; //dn
	}
}
