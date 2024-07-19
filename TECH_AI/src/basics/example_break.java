package basics;

public class example_break {
	public static void main(String[] args) {
		int x=1;
		
		while(x<=10) {
			System.out.println(x);
			while(x>=5) {
				System.out.println("welcome");
				if(x<=8) {
					System.out.println("good bye");
					break;
				}
			}
			x++;
		}
		x++;
	}

}
