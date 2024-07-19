package basics;

import java.util.Scanner;

public class factorialProgram {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in)) {
			System.out.println("enter factorial number");
			int num = Sc.nextInt();

		 	while(num>0) {

				int fact =1;
				int rem = num%10;
				for(int i=rem;i>0;i--) {
					fact = fact*i;
				}
				System.out.println("fact of "+ rem+ "is " + fact);
				num=num/10;
			}
		}

	}

}
