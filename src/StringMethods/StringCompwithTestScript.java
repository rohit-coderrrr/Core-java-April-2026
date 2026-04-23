package StringMethods;

public class StringCompwithTestScript {
	void ComapreSring() {
		String s="ABCD";String str="AbCD";
		System.out.println(s.equals(str));
		System.out.println("EqIgnore*** "+ s.equalsIgnoreCase(str));
		
	}
	void confirmPassword(String c,String n) {
		if(c.equals(n)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Matching");
			
		}
	}
	void CompareSrings() {
		String s="aBCD";String str="ABCD";
		System.out.println(s.compareTo(str));
		System.out.println("compIgnore*** "+ s.equalsIgnoreCase(str));
	}
	
	public static void maon(String[] args) {
		StringCompwithTestScript obj=new StringCompwithTestScript();
		
		obj.CompareSrings();
		
		// obj.confirmPassword("Password","Password");
		// obj.confirmPassword("Password","Password");
				
		
	}
}
