package LearnOverRiding;

public class FlipKartLogin extends AmazonLogin {
	void add(int x,int y) {
		System.out.println(x+y);
		
	}
	void signup() {
		System.out.println("Sign out Successful");
		super.add(112, 56);
		super.signup();
	}
	public static void main(String[] args) {
		FlipKartLogin obj=new FlipKartLogin();
		obj.signup();
		obj.add(112, 56);
	}

}
