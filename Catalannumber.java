import java.util.*;

/*
 * Catalan numbers are a sequence of natural numbers that occurs in many interesting counting problems like following.
 
 * Count the number of expressions containing n pairs of parentheses which are correctly matched. For n = 3, possible expressions are ((())), ()(()), ()()(), (())(), (()()).
 * Count the number of possible Binary Search Trees with n keys
 * Count the number of full binary trees (A rooted binary tree is full if every vertex has either two children or no children) with n+1 leaves.
 * Given a number n, return the number of ways you can draw n chords in a circle with 2 x n points such that no 2 chords intersect.
 * */
/*
 * C0 = 1
 * Cn = sum from i=0 to n Ci*Cn-i
 * */
public class Catalannumber {

	private int catalanNumber(int n) {
		if(n<=1) return 1;
		int[] dp = new int[n+1];
		dp[0]=dp[1]=1;
		for(int i=2;i<=n;i++) {
			for(int j=0;j<i;j++) {
				dp[i]+=dp[j]*dp[i-j-1];
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Catalannumber ob = new Catalannumber();
		System.out.println(ob.catalanNumber(n));
	}

}
