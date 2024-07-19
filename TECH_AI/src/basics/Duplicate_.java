package basics;

import java.util.Scanner;

public class Duplicate_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC =new Scanner(System.in);
		System.out.println("enter marks");
		int [] s =new int[6];
		int tot=0;
		for (int i=0; i>s.length; i++) {
			s[i] = SC.nextInt();
			tot = tot+ s[i];
			
		}
		System.out.println("total marks are :" + tot);
		if (tot>=420) {
			System.out.println(" grade a");
		}else if(tot>=350 && tot<420) {
			System.out.println("grade b");
		}else if (tot>=300 && tot<350) {
			System.out.println("grade c");
		}else if (tot<300) {
			System.out.println("grade d");
		}
		System.out.println("");
		
		int max=0;
		for (int i=0; i<s.length; i++) {
			if(max<s[i]) {
				max=s[i];
			}
		}
		System.out.println("max value is:"+max);
		
		int min=s[0];
		for (int i=0; i<s.length; i++) {
			if(min>s[i]) {
				
			}
		}
		System.out.println("min value is:"+min);


	}
}
