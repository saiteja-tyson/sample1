package basics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the number");
		int x= SC.nextInt();
		int value =x;
		int rev =0;
		while(x>0) {
			int rem = x%10;
			rev = rev*10+rem;
			x=x/10;
		}
		System.out.println("reverse:"+rev);
		if(value==rev) {
			System.out.println("given number is palindrome..."+value);
		}else {
			System.out.println("given number is not palindrome..."+ value);
		}
		

	}

}
