package basics;

import java.util.Scanner;

public class febonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner SC = new Scanner(System.in);
		System.out.println("enter the range of the febonaccial series");
		int n = SC.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(a);
		System.out.println(b);
		while (c<=n) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		
		}
	}

}
