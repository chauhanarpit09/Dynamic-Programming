import java.util.*;

/*
 * Given two numbers n and k where n represents a number of elements in a set, find a number of ways to partition the set into k subsets.
 * */


public class BellnumberUsingStirlingNumber {
	
	private int sterlinNumber(int n, int k,Integer[][] dp) {
		if(n==0 || k==0 || k>n) return 0;
		if(k==1 || k==n) return 1;
		if(dp[n][k]!=null) return dp[n][k];
		return dp[n][k] = k*sterlinNumber(n-1,k,dp)+sterlinNumber(n-1,k-1,dp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		BellnumberUsingStirlingNumber ob = new BellnumberUsingStirlingNumber();
		System.out.println(ob.sterlinNumber(n, k,new Integer[n+1][k+1]));
		
		//to calculate bell number(n)
		int a = 0;
		for(int i=0;i<=n;i++) {
			a+=ob.sterlinNumber(n, i,new Integer[n+1][i+1]);
		}
		System.out.println(a);
	}
}
