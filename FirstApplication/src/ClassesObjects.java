
public class ClassesObjects {
String brand;
String color;

//method 1
public void getInfo()
{
 System.out.println("brand is :" +brand +"\ncolor is :" +color);
}
//method 2
public String getInfo1()
{
	return ("brand is :" +brand +"\ncolor is :" +color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassesObjects obj= new ClassesObjects();
obj.brand= "Iphone";
obj.color="RoseGold";
obj.getInfo();
System.out.println();
ClassesObjects obj1= new ClassesObjects();
obj1.brand= "Redmi";
obj1.color="Black";
obj1.getInfo();
System.out.println();
obj1.brand="Samsung";
obj1.color="white";
System.out.println(obj1.getInfo1());
	}

}
