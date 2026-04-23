package Inheritance;

public class MethodOverLoading {
	void AddValue(int a,int b) {
		int r;
		r=a+b;
		System.out.println(" Result is "+r);
		
	}
	void AddValue (String a,String b) {
		String r;
		r=a+b;
		System.out.println(" Result is "+ r);
	}
	
	int AddValue(int a,int b,int c) {
		int r;
		r=a+b+c;
		return r;
	}
	void AddValue() {
		int a=10;int b=9;
		int r;
		r=a+b;
		System.out.println(" Result is "+ r);
	}
	public static void main(String[] args) {
		MethodOverLoading o= new MethodOverLoading();
		o.AddValue(14, 18);
		o.AddValue();
		System.out.println(" Result is "+o.AddValue(14, 18,17));
		o.AddValue("Yess", "Infotech");
	}
}
