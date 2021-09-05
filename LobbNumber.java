import java.util.Scanner;

/*
 * In combinatorial mathematics, the Lobb number Lm, n counts the number of ways that n + m 
   open parentheses can be arranged to form the start of a valid sequence of balanced parentheses. 
   The Lobb number are parameterized by two non-negative integers m and n with n >= m >= 0. It can be obtained by: 
 * Lobb Number is also used to count the number of ways in which n + m copies of the value +1 and n – m 
   copies of the value -1 may be arranged into a sequence such that all of the partial sums of the sequence are non- negative.
 
 * */
public class LobbNumber {

	private int catalnNumber(int n,int k) {
		int[][] dp = new int[n+1][k+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=Math.min(k,i);j++) {
				if(j==0 || j==i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
				}
			}
		}
		return dp[n][k];
	}
	private int lobbNumber(int n,int m) {
		
		return ((2*m+1) * catalnNumber(2*n,m+n))/(m+n+1);
	}
	public static void main(String[] args) {
		LobbNumber ob = new LobbNumber();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(ob.lobbNumber(n,m));
	}

}
