package basics;
import java.util.Scanner;


public class Switch_Case {
	public static void main (String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("enter day number to display the day");
		int dayno = SC.nextInt();
		switch (dayno) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
			default :
				System.out.println("no day numbers");
				break;
				
		}
		
	}
	

}
