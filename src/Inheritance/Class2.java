 package Inheritance;

public class Class2 extends Class1 {
	void multiply(int a,int b) {
		int r=a*b;
		System.out.println(r);
		
	}
	Class2(){
		System.out.println("Constructor of Class2");
	}
	public static void main(String[] args) {
		Class2 c2=new Class2();
		c2.addnumbers(56,25 );
		c2.multiply(56, 25);
	}

}
