package Inheritance;

public class Class1 {
	void addnumbers(int i,int j) {
		int r=i+j;
		System.out.println(r);
		
	}
	Class1(){
		System.out.println("Constructor of Class1");
		
	}
	public static void main(String[] args) {
		Class1 o=new Class1();
		o.addnumbers(12,25);
	}

}
