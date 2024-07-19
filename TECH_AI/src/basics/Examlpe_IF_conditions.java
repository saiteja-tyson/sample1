package basics;

import java.util.Scanner;

public class Examlpe_IF_conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int x=sc.nextInt();
		if(x%2==0) {
			System.out.println("even number"+x);
		}else {
			System.out.println("odd number"+x);
		}
	}

}
