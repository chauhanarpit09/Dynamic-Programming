import java.util.*;

/*
   C(n, k) = C(n-1, k-1) + C(n-1, k)
   C(n, 0) = C(n, n) = 1
 
 */
public class BinomialCoffecient {

	
	private int bcRecursive(int n,int k) {
		if(k>n) return 0;
		if(k==0 || k==n) return 1;
		return bcRecursive(n-1,k-1)+bcRecursive(n-1,k);
	}
	private int binomialCoffecient(int n,int k) {
		int[][] dp = new int[n+1][k+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=Math.min(i,k);j++) {
				if(j==0 || j==i)
					dp[i][j] = 1;
				else
					dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
			}
		}
		return dp[n][k];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		BinomialCoffecient ob = new BinomialCoffecient();
		System.out.println(ob.binomialCoffecient(n, k)+"  "+ob.bcRecursive(n, k));

	}

}
