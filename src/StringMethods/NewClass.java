package StringMethods;

public class NewClass {
	void forloopchar(){
		for (char c='A';c<='z';c++) {
		System.out.print(" "+c+ " ");
		}
	
	}
		void ReverseString(String s) {
			StringBuilder sb=new StringBuilder(s);
			System.out.println(sb.reverse());
		}
		void ReverseStringwithSB(String s) {
			for(int i=s.length()-1;i>=0;i--) {
				System.out.println(s.charAt(i));
			}
		}
		
		public static void main(String[] args){
			NewClass obj=new NewClass();
			obj.ReverseString("YESS");
			obj.ReverseStringwithSB("YESS");
		}
	

}
