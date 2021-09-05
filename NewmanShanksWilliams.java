/*
 	In mathematics, a Newman–Shanks–Williams prime (NSW prime) is a prime number p which can be written in the form: 

	{\huge S_{2m+1} = \frac{ {(1+\sqrt{2})^{2m+1} + (1-\sqrt{2})^{2m+1} } }{2} }      
	
	Recurrence relation for Newman–Shanks–Williams prime is:
	S_0 = 1      
	S_1 = 1      
	S_n = 2*S_{n-1} + S{n-2}      
	The first few terms of the sequence are 1, 1, 3, 7, 17, 41, 99,…
https://www.geeksforgeeks.org/newman-shanks-williams-prime/
 * */

import java.util.*;
public class NewmanShanksWilliams {
	
	private int NewmanShanksWilliams(int n) {
		int first =  1;
		int second = 1;
		for(int i=2;i<=n;i++) {
			int temp = 2*second+first;
			first = second;
			second = temp;
		}
		return second;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NewmanShanksWilliams ob = new NewmanShanksWilliams();
		System.out.println(ob.NewmanShanksWilliams(n));

	}

}
