package basics;

public class Example_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//		int a=10;
//		int b=20;
//		int c=a++ +a +b +b++ +a++ +b;
//		System.out.println(c);
		
		postfix();
		prefix();
		prefix1() ;
	}
	public static void postfix() {
	int a=10;
	int b=20;
	int c=a++ +a +b +b++ +a++ +b;
	System.out.println(c);
	}
	public static void prefix() {
		int a=10;
		int b=20;
		int c= --a +a +b + --b + --a + --b +a + --b;
		System.out.println(c);
	}public static void prefix1() {
		int a=10;
		int b=20;
		int c=a+ ++a +b + ++b +a;
		System.out.println(c);
	}
	


}
