package Abstraction;

public class SBI  {
	
	public void withdrawMoney(int w) {
		
		int op = 30000;
		int b = op-w;
		
		System.out.println("SBO : Your Account Balance after withdrawal is " + b);
	}
	

}
