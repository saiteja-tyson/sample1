package basics;

public class Example_Static_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(200,300);
		add(101,202);
		add(1,2);
		combine("sai ","tyson ","teja");
		even_or_odd(23);
		even_or_odd(22);
		
	}
	public static void add(int x,int y) {
		int z=x+y;
		System.out.println("sum : "+z);
	}
	public static void combine(String str1,String str2,String str3) {
		String str=str1+str2+str3;
		System.out.println("combine:"+str);
	}
	public static void even_or_odd(int x) {
		if(x%2==0) {
			System.out.println("given number is even number");
		}
		else {
			System.out.println("given number is odd");
		}
	}

}
