package myPackage;

public class ConstructorEg1 {

	int roll_num;
	String name;
	
	public ConstructorEg1(int roll_num, String name)
	{
		this.roll_num=roll_num;
		this.name=name;
	}
	void details()
	{
		System.out.println(roll_num);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorEg1 obj= new ConstructorEg1(11,"Abc");
obj.details();
	}

}
