import java.util.*;

/* 
 * Given a set of n elements, find number of ways of partitioning it. 
 * Given a squarefree number x, find the number of different multiplicative partitions of x. 
   The number of multiplicative partitions is Bell(n) where n is number of prime factors of x. For example x = 30, 
   there are 3 prime factors of 2, 3 and 5. So the answer is Bell(3) which is 5. The 5 partitions are 1 x 30, 2 x15, 3 x 10, 5 x 6 and 2 x 3 x 5.

*/

//Approach using bell triangle
/*
 
 1
 1  2
 2  3  5
 5  7  10  15
 15 20 27  37 52
 
 the series in the 0th column is the series of bell number
 
 
 */
public class Bellnumber {

	
	private int bellnumber(int n) {
		int[][] dp = new int[n+1][n+1];
		dp[0][0] =1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0)
					dp[i][j] = dp[i-1][i-1];
				else
					dp[i][j] = dp[i-1][j-1]+dp[i][j-1];
			}
		}
		return dp[n][0];
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bellnumber ob = new Bellnumber();
		System.out.println(ob.bellnumber(n));
	}

}
