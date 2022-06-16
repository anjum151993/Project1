package myPackage;

public class MethodOverloadingEg {

	public MethodOverloadingEg() {
		// TODO Auto-generated constructor stub
	}
	
	void sum(int a, int b)
	{
		System.out.println("Sum of two integer numbers is :" +(a+b));
	}
	
	void sum(float a, float b)
	{
		System.out.println("Sum of two decimal numbers is " +(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloadingEg obj = new MethodOverloadingEg();
obj.sum(1, 2);
obj.sum(1.0f, 3.0f);
		
	}

}
