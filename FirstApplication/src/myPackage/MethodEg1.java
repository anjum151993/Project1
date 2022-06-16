package myPackage;

public class MethodEg1 {
	//without using return type
	int sum;
	public void add(int a, int b)
	{
		sum= a+b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEg1 obj= new MethodEg1();
		obj.add(10, 20);
		
		
	}

}
