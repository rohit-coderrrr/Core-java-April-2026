package LearnOverRiding;

public class Test extends FlipKartLogin {
	void add(int a,int b) {
		System.out.println(a*b);
	}
	
		public static void main(String [] args) {
			Test o=new Test();
			o.add(50, 20);
		}
	

}
