package pack2;

import myPackage1.A;
//import myPackage1.A;
public class B {
public static void main(String[] args) {
	//A obj= new A();
	myPackage1.A obj= new myPackage1.A();
	System.out.println(obj.add(11, 22));
	
}
}
