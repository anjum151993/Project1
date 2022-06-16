package myPackage;

public class StudentEg {

	//static variable(used for memory management)
	static String Univ_name="GalgotiasUniversity";
//	String Univ_name;
	String name;
	int roll_num;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentEg obj= new StudentEg();
obj.roll_num= 10;
obj.name="Anjali";

StudentEg obj2= new StudentEg();
obj2.roll_num=11;
obj2.name="Priya";

StudentEg obj3= new StudentEg();
obj3.roll_num=12;
obj3.name="Anil";

System.out.println(obj.roll_num + ", " +obj.name + ", " +Univ_name );
System.out.println(obj2.roll_num + ", " +obj2.name + ", " +Univ_name );
System.out.println(obj3.roll_num + ", " +obj3.name + ", " +StudentEg.Univ_name );
		
	}

}
