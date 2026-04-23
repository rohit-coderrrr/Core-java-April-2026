package StringMethods;

public class IntroString {
	String l="Kohli ";String f="Virat ";
	String s="Anushka";
	void show() {
		System.out.println(s.length());	
	    System.out.println(s+ " "+l);
	    System.out.println(l.concat(" Anushka"));
		System.out.println(f.concat(l));
}
	void getposition(String str) {
		for(int i=0;i<=str.length()-1;i++) {
			System.out.print(" "+str.charAt(i));
		
		}
		System.out.print("");
		for(int i=str.length()-1;i>0;i--){
			System.out.print(" "+str.charAt(i));
		}
	
		
	}


	public static void main(String[] args) {
		IntroString obj=new IntroString();
		obj.getposition("Anushka ***");
	}
	}
